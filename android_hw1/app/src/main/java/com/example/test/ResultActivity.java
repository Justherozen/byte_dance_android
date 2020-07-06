package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity<message> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    Intent intent = getIntent();
    String message = intent.getStringExtra(MainActivity.EA_XTRA_MESSAGE);
    TextView textView_a = findViewById(R.id.textView3);
    textView_a.setText(message);
    }
}
