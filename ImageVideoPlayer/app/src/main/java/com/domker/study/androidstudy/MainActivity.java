package com.domker.study.androidstudy;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.domker.study.androidstudy.player.VideoPlayerIJK;
import com.domker.study.androidstudy.player.VideoPlayerListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * Created by Kim on 2020-07-15 17:20
 */
public class MainActivity extends AppCompatActivity {

    private VideoPlayerIJK ijkPlayer;
    private boolean condition = false;
    private Handler handler = new Handler();
    private Runnable runnable;
    private SeekBar seekBar;
    private TextView textView;
    private Button PausePlay;
    private int during;
    private final static String IMAGE_URL = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1562328963756&di=9c0c6c839381c8314a3ce8e7db61deb2&imgtype=0&src=http%3A%2F%2Fpic13.nipic.com%2F20110316%2F5961966_124313527122_2.jpg";
    private ImageView mImageView;
    private Button buttonLoad;

    public void init(){
        runnable = new Runnable() {
            @Override
            public void run() {
                float progress = (float)(ijkPlayer.getCurrentPosition())/(float)(ijkPlayer.getDuration());
                seekBar.setProgress((int)(progress*100));
                during = (int) ijkPlayer.getDuration();
                long current_hour = ijkPlayer.getCurrentPosition()/(1000*3600);
                long current_minute = ijkPlayer.getCurrentPosition()%(1000*3600) / (60 * 1000);
                long current_second = ijkPlayer.getCurrentPosition()%(60 * 1000) / 1000;

                String current_time = String.format("%s:%s:%s",
                        String.format( "%02d", current_hour),
                        String.format("%02d", current_minute),
                        String.format("%02d", current_second));

                long total_hour = ijkPlayer.getDuration()/(1000*3600);
                long total_minute = ijkPlayer.getDuration()%(1000*3600) / (60 * 1000);
                long total_second = ijkPlayer.getDuration()%(60 * 1000) / 1000;
                String total_time = String.format("%s:%s:%s",
                        String.format( "%02d", total_hour),
                        String.format("%02d", total_minute),
                        String.format("%02d", total_second));
                textView.setText(current_time + "/" + total_time);
                seekBar.postInvalidate();
                handler.postDelayed(runnable, 100);
            }
        };
        handler.post(runnable);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_tv);
        seekBar = findViewById(R.id.seek_sb);
        setTitle("ImageVideoPlayer");
        init();
        ijkPlayer = findViewById(R.id.ijkPlayer);
        PausePlay = findViewById(R.id.button_bt);

        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception e) {
            this.finish();
        }
        ijkPlayer.setListener(new VideoPlayerListener());
        ijkPlayer.setVideoResource(R.raw.bytedance);

        PausePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (condition) {
                    ijkPlayer.start();
                    condition = false;
                } else {
                    ijkPlayer.pause();
                    condition = true;
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b == true) {
                    ijkPlayer.start();
                    float percent = (float) i / 100;
                    ijkPlayer.seekTo((int) (percent * during));
                    if (condition==true)
                        condition = false;
                }

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        mImageView = findViewById(R.id.imageView);
        buttonLoad = findViewById(R.id.buttonLoad);
        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadImage();
            }
        });
    }

    private void loadImage() {
        RequestOptions cropOptions = new RequestOptions();
        cropOptions = cropOptions.circleCrop();
        Glide.with(MainActivity.this)
                .load(IMAGE_URL)
                .apply(cropOptions)
                .placeholder(R.drawable.icon_progress_bar)
                .error(R.drawable.icon_failure)
                .fallback(R.drawable.ic_launcher_background)
////                .thumbnail(Glide.with(this).load(IMAGE_URL2))
                .transition(withCrossFade(4000))
                .into(mImageView);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (ijkPlayer.isPlaying()) {
            ijkPlayer.stop();
        }

        IjkMediaPlayer.native_profileEnd();
    }

    private boolean portrait;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        portrait = newConfig.orientation == Configuration.ORIENTATION_PORTRAIT;
        tryFullScreen(!portrait);
    }

    private void tryFullScreen(boolean fullScreen) {
        if (MainActivity.this instanceof AppCompatActivity) {
            ActionBar supportActionBar = ((AppCompatActivity) MainActivity.this).getSupportActionBar();
            if (supportActionBar != null) {
                if (fullScreen) {
                    supportActionBar.hide();
                    PausePlay.setVisibility(View.GONE);
                    buttonLoad.setVisibility(View.GONE);
                } else {
                    supportActionBar.show();
                    PausePlay.setVisibility(View.VISIBLE);
                    buttonLoad.setVisibility(View.VISIBLE);
                }
            }
        }
        setFullScreen(fullScreen);
    }

    private void setFullScreen(boolean fullScreen) {
        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        if (fullScreen) {
            attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
            getWindow().setAttributes(attrs);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        } else {
            attrs.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().setAttributes(attrs);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

    }

}
