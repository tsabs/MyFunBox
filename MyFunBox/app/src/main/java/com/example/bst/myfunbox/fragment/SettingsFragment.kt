package com.example.bst.myfunbox.fragment


import android.support.v4.app.Fragment
import android.os.Bundle
import android.preference.PreferenceFragment
import android.support.v7.preference.PreferenceFragmentCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ListView
import android.widget.TextView

import com.example.bst.myfunbox.R
import com.example.bst.myfunbox.adapter.MyAdapterS
import com.example.bst.myfunbox.model.Settings
import java.lang.ref.WeakReference


class SettingsFragment : PreferenceFragmentCompat() {


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference_settings, rootKey)
    }

//    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
////        val root = inflater!!.inflate(R.layout.fragment_settings, container, false)
////
////
////        return root
//
//        val tv = TextView(activity)
//        tv.setText(R.string.hello_blank_fragment)
//        return tv
//    }
}
