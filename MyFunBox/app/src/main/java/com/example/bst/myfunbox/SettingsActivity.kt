package com.example.bst.myfunbox

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.bst.myfunbox.fragment.SettingsFragment


class SettingsActivity : AppCompatActivity(){

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val t = manager.beginTransaction()
        val fragment = SettingsFragment()
        t.replace(android.R.id.content, fragment)
        t.commit()
    }
}
