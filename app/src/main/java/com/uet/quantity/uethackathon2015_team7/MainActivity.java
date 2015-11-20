package com.uet.quantity.uethackathon2015_team7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.uet.quantity.uethackathon2015_team7.service.NotificationService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Intent service = new Intent(MainActivity.this, NotificationService.class);
        startService(service);*/
    }
}
