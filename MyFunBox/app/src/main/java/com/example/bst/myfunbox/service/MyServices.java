package com.example.bst.myfunbox.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;


public class MyServices extends Service implements MediaPlayer.OnPreparedListener {

    public static final String ACTION_PLAY = "com.example.action.PLAY";
    public static final String MUSIC_RAW = "raw_param";
    private MediaPlayer mp;


    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i("test", "Enfin");
        if(intent.getAction().equals(ACTION_PLAY)){
            if(mp == null){
                mp = MediaPlayer.create(this, intent.getIntExtra(MUSIC_RAW, 0));
                mp.setOnPreparedListener(this);
                mp.prepareAsync();
            }
            mp.start();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
