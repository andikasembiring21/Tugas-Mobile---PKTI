package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_daftaruser.*
import kotlinx.android.synthetic.main.activity_verifikasi_user.*

class verifikasi_user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_user)


        setSupportActionBar(VerifikasiUser_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onLanjutVerif(view: View) {
        var intentLanjutVerif = Intent(this, verifikasi_sukses::class.java)
        startActivity(intentLanjutVerif)
    }
}