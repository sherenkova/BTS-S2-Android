package com.example.a9alumno.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        /* TODO: Return the communication channel to the service. */
        return null;
    }
}