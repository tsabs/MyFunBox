package com.example.bst.myfunbox

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.media.MediaPlayer
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import com.example.bst.myfunbox.adapter.RButton
import com.example.bst.myfunbox.fragment.AsterixFragment
import com.example.bst.myfunbox.fragment.RickFragment
import kotlinx.android.synthetic.main.nav_header_main.*
import kotlinx.android.synthetic.main.rick_button.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            imageView.setImageResource(R.drawable.rick)
            val t = manager.beginTransaction()
            val fragment = RickFragment()
            t.replace(R.id.flContent, fragment)
            t.commit()
            //Try to make code as teacher want

//            val button1 = findViewById(R.id.rb1)
//            val mp : MediaPlayer
//            mp = MediaPlayer.create(this, R.raw.rr1)
//            button1.setOnClickListener(){
//                mp.start()
//            }

        } else if (id == R.id.nav_gallery) {
            imageView.setImageResource(R.drawable.asterix)
            val t = manager.beginTransaction()
            val fragment = AsterixFragment()
            t.replace(R.id.flContent, fragment)
            t.commit()

        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}