package com.example.bst.myfunbox.adapter

import android.content.Context
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.model.Citation
import java.lang.ref.WeakReference

class MyAdapterA(val context : WeakReference<Context>, val elems : ArrayList<Citation>) : BaseAdapter(){
    override fun getView(position: Int, view: View?, container: ViewGroup?): View {
        val root = LayoutInflater.from(context.get()).inflate(R.layout.asterix_button, container, false)
        val mp : MediaPlayer = MediaPlayer.create(context.get(), R.raw.rr1)

        root.findViewById<Button>(R.id.buttonA).setOnClickListener({
            mp.start()
        })

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