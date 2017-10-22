package com.example.bst.myfunbox.fragment


import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

import com.example.bst.myfunbox.R


class SettingsFragment : PreferenceFragmentCompat(), SharedPreferences.OnSharedPreferenceChangeListener {

    val KEY_PREF_SYNC_CONN = "pref_syncConnectionType"

    override fun onSharedPreferenceChanged(sp: SharedPreferences?, key: String?) {
        if(key!! == KEY_PREF_SYNC_CONN){
            val connectionPref = findPreference(key)
            connectionPref.summary = sp!!.getString(key, "")
        }
    }


    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preference_settings, rootKey)
    }
}
