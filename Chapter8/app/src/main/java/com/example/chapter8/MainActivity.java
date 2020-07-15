package com.example.chapter8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTakePhoto;
    private static final int REQUEST_CODE_TAKE_PHOTO = 1358;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTakePhoto = findViewById(R.id.button);
        bind();
    }

    private void bind() {
        btnTakePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}