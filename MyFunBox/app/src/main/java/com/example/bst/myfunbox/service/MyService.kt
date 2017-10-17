package com.example.bst.myfunbox.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log


class MyService : Service(), MediaPlayer.OnPreparedListener{

    companion object {
        val MUSIC_RAW_PARAM = "raw_param"
        var mp : MediaPlayer? = null
        const val ACTION_PLAY = "com.example.action.PLAY"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("test", "on y est")
        when (intent!!.action)
        {
            ACTION_PLAY -> {
                if (mp == null)
                {
                    mp = MediaPlayer.create(this, intent.getIntExtra(MUSIC_RAW_PARAM, 0))
                    mp!!.setOnPreparedListener(this)
                    mp!!.prepareAsync()
                }
                mp!!.start()
                Log.d("test", "on y est")
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO()
    }

    override fun onPrepared(player: MediaPlayer?) {
        player!!.start()
    }

}