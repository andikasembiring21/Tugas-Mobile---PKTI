package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class verifikasi_sukses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_sukses)
    }

    fun onVerifikasiUser(view: View) {
        var intentVerfikasi = Intent(this, home::class.java)
        startActivity(intentVerfikasi)
    }
}