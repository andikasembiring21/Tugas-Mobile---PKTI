package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detailpesanan_user.*
import kotlinx.android.synthetic.main.activity_riwayatpemesanan.*

class riwayatpemesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayatpemesanan)

        setSupportActionBar(RiwayatPemesanan_Toolbar)

        supportActionBar?.apply {


            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onProsesUser(view: View) {
        var intentProses = Intent(this, proses_user::class.java)
        startActivity(intentProses)
    }

    fun onSelesaiRiwayat(view: View) {
        var intentSelesaiRiwayat = Intent(this, riwayatpemesanan::class.java)
        startActivity(intentSelesaiRiwayat)
    }


}