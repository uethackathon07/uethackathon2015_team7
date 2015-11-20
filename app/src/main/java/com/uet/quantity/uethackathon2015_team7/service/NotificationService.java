package com.uet.quantity.uethackathon2015_team7.service;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by James Crabby on 11/20/2015.
 */
public class NotificationService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        /*Intent myIntent = new Intent(this , NotificationService.class);
    AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
    PendingIntent pendingIntent = PendingIntent.getService(getApplicationContext(), 0, myIntent, 0);
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, 12);
    calendar.set(Calendar.MINUTE, 00);
    calendar.set(Calendar.SECOND, 00);
    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 24 * 60 * 60 * 1000, pendingIntent);*/
        return Service.START_STICKY;
    }
}
