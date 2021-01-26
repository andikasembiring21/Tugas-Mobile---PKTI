package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_konfirmasi_pemesanan.*
import kotlinx.android.synthetic.main.activity_pesanan.*

class konfirmasi_pemesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi_pemesanan)

        setSupportActionBar(Konfirmasipemesanan_Toolbar)

        supportActionBar?.apply {


            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onKonfirmasiPesanan(view: View) {
        var intentKonfirmasi2 = Intent(this, detailpesanan_user::class.java)
        startActivity(intentKonfirmasi2)
    }
}