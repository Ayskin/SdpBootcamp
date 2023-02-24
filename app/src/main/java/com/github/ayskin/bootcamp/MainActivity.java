package com.github.ayskin.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, GreetingActivity.class);
        intent.putExtra("nameToGreet", ((EditText) findViewById(R.id.mainName)).getText().toString());
        MainActivity.this.startActivity(intent);
    }
}