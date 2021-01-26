package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.fragment_notifikasi.*

class history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        setSupportActionBar(His_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onBengkel(view: View) {
        var intentabgl = Intent(this, pesanan::class.java)
        startActivity(intentabgl)
    }
    fun onHomes(view: View) {
        var intentahmo = Intent(this, bengkel::class.java)
        startActivity(intentahmo)
    }
    fun  onProses(view: View) {
        var intentProses = Intent(this, proseshistory::class.java)
        startActivity(intentProses)
    }
}