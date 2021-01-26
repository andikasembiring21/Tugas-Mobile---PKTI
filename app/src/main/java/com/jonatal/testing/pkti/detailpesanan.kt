package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detailpesanan.*
import kotlinx.android.synthetic.main.activity_log_in.*

class detailpesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailpesanan)

        setSupportActionBar(Detail_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onTrimaPesan(view: View) {
        var intentterima = Intent(this, notifikasi::class.java)
        startActivity(intentterima)
    }
    fun onTolakPesanan(view: View) {
        var intenttolak = Intent(this, notifikasi::class.java)
        startActivity(intenttolak)
    }
    fun onClose(view: View) {
        var intentclose = Intent(this, notifikasi::class.java)
        startActivity(intentclose)
    }
}