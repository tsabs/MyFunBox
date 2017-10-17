package com.example.bst.myfunbox.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.model.Settings
import org.jetbrains.anko.find
import java.lang.ref.WeakReference

class MyAdapterS(val context : WeakReference<Context>, val elems: ArrayList<Settings>) : BaseAdapter(){
    override fun getView(position: Int, view: View?, container: ViewGroup?): View {
        val root = LayoutInflater.from(context.get()).inflate(R.layout.setting_view, container, false)

        root.findViewById<TextView>(R.id.editName)
        root.findViewById<Spinner>(R.id.language)
        root.findViewById<EditText>(R.id.comment)

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