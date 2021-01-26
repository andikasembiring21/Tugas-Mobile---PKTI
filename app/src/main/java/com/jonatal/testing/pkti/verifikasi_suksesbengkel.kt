package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class verifikasi_suksesbengkel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi_suksesbengkel)
    }

    fun onVerifikasiBengkel(view: View) {
        var intentVerifikasiBengkel = Intent(this, bengkel::class.java)
        startActivity(intentVerifikasiBengkel)
    }
}