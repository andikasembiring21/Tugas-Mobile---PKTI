package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun onMasuk(view: View) {
        var intentIn = Intent(this, log_in::class.java)
        startActivity(intentIn)
    }

    fun onDftr(view: View) {
        var intentDaf = Intent(this, daftar::class.java)
        startActivity(intentDaf)
    }
}