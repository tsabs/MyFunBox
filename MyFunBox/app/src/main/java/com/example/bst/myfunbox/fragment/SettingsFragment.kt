package com.example.bst.myfunbox.fragment


import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

import com.example.bst.myfunbox.R


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
