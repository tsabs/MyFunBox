package com.example.bst.myfunbox.adapter

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.media.MediaPlayer
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.R.id.start
import com.example.bst.myfunbox.fragment.AsterixFragment
import com.example.bst.myfunbox.fragment.RickFragment
import com.example.bst.myfunbox.model.Citation
import com.example.bst.myfunbox.service.MyService
import com.example.bst.myfunbox.service.MyServices
import kotlinx.android.synthetic.main.rick_button.*
import org.jetbrains.anko.startService
import java.lang.ref.WeakReference

class MyAdapterR(val context: WeakReference<Context>, val elems : ArrayList<Citation>) : BaseAdapter(){

    override fun getView(position: Int, view: View?, container: ViewGroup?): View {
        val root = LayoutInflater.from(context.get()).inflate(R.layout.rick_button, container, false)
        var mediaPlayer = Intent(context.get(), MyService::class.java)
        mediaPlayer.action = MyService.ACTION_PLAY
        mediaPlayer.putExtra(MyService.MUSIC_RAW_PARAM, elems[position].rawValue)
        root.setOnClickListener {
            context.get()!!.startService(mediaPlayer)
        }

        root.findViewById<Button>(R.id.buttonR).text = elems[position].description

        return root
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return elems.size
    }

}
