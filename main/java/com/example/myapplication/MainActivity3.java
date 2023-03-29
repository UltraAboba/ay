package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void gohome(View View) {
        //Intent intent;
        //intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        startActivity(new Intent(this, MainActivity.class));
    }
}