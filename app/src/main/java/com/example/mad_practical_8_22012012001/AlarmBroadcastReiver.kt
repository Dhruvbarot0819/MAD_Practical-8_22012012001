package com.example.mad_practical_8_22012012001

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReiver : BroadcastReceiver() {
    companion object{val ALARMKEY="mad"
    val ALARM_START="morning"
    val ALARM_STOP="sc"}
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
      val data=intent.getStringArrayExtra(ALARMKEY)
        val intentService=Intent(context,AlarmService::class.java)
        if(data== ALARM_START){

            context.startService(intentService)
        }
        else if(data== ALARM_STOP){
            context.startService(intentService)
        }
    }
}