package com.example.mad_practical_8_22012012001

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {
    lateinit var Player: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onDestroy() {
        Player.stop()
        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent !=null){
            Player=MediaPlayer.create(this,R.raw.alarm)
            Player.start()
        }
        return START_STICKY
    }
}