package com.example.user.myapplication.pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.myapplication.API.Controller;
import com.example.user.myapplication.API.Controller;
import com.example.user.myapplication.BuildConfig;
import com.example.user.myapplication.R;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        Controller controller = new Controller();
        controller.start();
    }
}