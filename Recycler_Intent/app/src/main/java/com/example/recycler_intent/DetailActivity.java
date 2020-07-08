package com.example.recycler_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        initView();
    }
    private void initView(){
        TextView info = findViewById(R.id.ItemIndex);
        Intent get_intent = getIntent();
        String content = "这是点击的第"+get_intent.getIntExtra("position",-1)+"条数据项";
        info.setText(content);
    }
}
