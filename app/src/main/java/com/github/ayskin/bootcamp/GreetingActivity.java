package com.github.ayskin.bootcamp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        String greetingMessage = String.format("Hello %s!", getIntent().getStringExtra("nameToGreet"));
        ((TextView) findViewById(R.id.greetingMessage)).setText(greetingMessage);
    }
}