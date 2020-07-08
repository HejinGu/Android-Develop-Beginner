package com.example.chapter3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import com.airbnb.lottie.LottieAnimationView;

public class Exercise1Activity extends AppCompatActivity {

    private LottieAnimationView animationView;
    private CheckBox loopCheckBox;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        animationView = findViewById(R.id.animation_view);
        loopCheckBox = findViewById(R.id.loop_checkbox);
        seekBar = findViewById(R.id.seekbar);

        loopCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    animationView.playAnimation();
                    seekBar.setEnabled(false);
                } else {
                    animationView.pauseAnimation();
                    seekBar.setEnabled(true);
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                animationView.setProgress((progress+0.0f)/seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}
