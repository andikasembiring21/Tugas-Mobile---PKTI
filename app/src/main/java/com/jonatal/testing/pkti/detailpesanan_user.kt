package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detailpesanan_user.*
import kotlinx.android.synthetic.main.activity_konfirmasi_pemesanan.*

class detailpesanan_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailpesanan_user)

        setSupportActionBar(detailpemesanan_Toolbar)

        supportActionBar?.apply {


            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onSelesaiDetail(view: View) {
        var intentSelesaiDetail = Intent(this, usertoko::class.java)
        startActivity(intentSelesaiDetail)
    }

}