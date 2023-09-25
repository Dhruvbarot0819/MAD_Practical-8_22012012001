package com.example.mad_practical_8_22012012001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setalarm(minitime:Long,action:String){
        val intentalarm=Intent(applicationContext,AlarmBroadcastReiver::class.java)

    }
}