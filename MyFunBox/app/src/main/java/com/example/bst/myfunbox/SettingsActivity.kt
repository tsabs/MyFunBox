package com.example.bst.myfunbox

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.bst.myfunbox.fragment.SettingsFragment
import org.jetbrains.anko.act
import org.jetbrains.anko.defaultSharedPreferences


class SettingsActivity : AppCompatActivity(){

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sp = defaultSharedPreferences
        val usrName : String = sp.getString("name", "NA")
        val swSocial : Boolean = sp.getBoolean("switch", true)
        val checkScreen : Boolean = sp.getBoolean("check", true)

        val t = manager.beginTransaction()
        val fragment = SettingsFragment()
        t.replace(android.R.id.content, fragment)
        t.commit()

        val mPrefs : SharedPreferences = act.getPreferences(Context.MODE_PRIVATE)
    }
}
