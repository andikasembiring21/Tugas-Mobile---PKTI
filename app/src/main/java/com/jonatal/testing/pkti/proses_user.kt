package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_proses_user.*
import kotlinx.android.synthetic.main.activity_riwayatpemesanan.*

class proses_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses_user)


        setSupportActionBar(RiwayatPemesanan2_Toolbar)

        supportActionBar?.apply {


            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

    }
    fun onSelesaiRiwayat(view: View) {
        var intentSelesaiRiwayat = Intent(this, riwayatpemesanan::class.java)
        startActivity(intentSelesaiRiwayat)
    }
//    fun onPesanbengkel(view: View) {
//        var intentPesanbngk = Intent(this, pesanan::class.java)
//        startActivity(intentPesanbngk)
//    }
}