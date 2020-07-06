package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch sw = findViewById(R.id.sw_DarkMode);
        Button btn = findViewById(R.id.btn_modify);
        final TextView tv = findViewById(R.id.tv_title);
        final TextView tv1 = findViewById(R.id.tv_Invisible);
        final CheckBox cbx = findViewById(R.id.cbx_1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tv.setText("开启");
                    tv.setTextColor(Color.LTGRAY);
                    tv.setBackgroundColor(Color.BLACK);
                    Log.i("switch_on", "Dark mode open.");
                } else {
                    tv.setText("关闭");
                    tv.setTextColor(Color.BLACK);
                    tv.setBackgroundColor(Color.LTGRAY);
                    Log.i("switch_off", "Dark mode closed.");
                }
            }
        });

        cbx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tv1.setTextColor(Color.LTGRAY);
                    Log.i("cbx_checked", "Invisible text out.");
                } else {
                    tv1.setTextColor(Color.WHITE);
                    Log.i("cbx_uncheck", "Text invisible.");
                }
            }
        });
    }

    public void shrink(View v) {
        TextView tv = findViewById(R.id.tv_title);
        tv.setTextSize(40);
        Log.i("btn_shrink", "Text size smaller.");
    }

    public void sure(View v) {
        EditText name= findViewById(R.id.edt_input);
        TextView tv = findViewById(R.id.tv_title);
        tv.setText(name.getText().toString());
        Log.i("edit_finished", "Change text content.");
    }
}
