package com.bytedance.todolist.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.bytedance.todolist.R;

public class NoteActivity extends AppCompatActivity {
    private EditText editText;
    private Button addBtn;
    private String mText;
    public static final String KEY = "user_input";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        addBtn = findViewById(R.id.btn_add);
        editText = findViewById(R.id.input_etx);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText = editText.getText().toString();
                Intent mIntent = new Intent();
                mIntent.putExtra(KEY,mText);
                if (mText.isEmpty()){
                    setResult(RESULT_CANCELED,mIntent);
                } else {
                    setResult(RESULT_OK,mIntent);
                }
                finish();
            }
        });
    }
}
