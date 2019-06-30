package com.example.lucky_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import cn.bmob.v3.Bmob;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this, "ae52cfb3930ff0a825aab5cf155f5f8d");



    }

}
