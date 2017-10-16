package com.example.bst.myfunbox.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.adapter.MyAdapterS
import com.example.bst.myfunbox.model.Settings
import java.lang.ref.WeakReference


/**
 * A simple [Fragment] subclass.
 */
class SettingsFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root = inflater!!.inflate(R.layout.fragment_settings, container, false)


        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list: ArrayList<Settings> = arrayListOf()
        list.add(Settings("Scherrer", true, "Il y a un problème sur le bouton 5 dans la section rick"))

        view!!.findViewById<ListView>(R.id.listView).adapter = MyAdapterS(WeakReference(context), list)
    }

}
