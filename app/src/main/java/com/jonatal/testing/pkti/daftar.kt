package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class daftar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
    }

    fun onAkun(view: View) {
        var intentAkn = Intent(this, log_in::class.java)
        startActivity(intentAkn)
    }

    fun ondaftarBengkel(view: View) {
        var intentDBengkel = Intent(this, daftarbengkel::class.java)
        startActivity(intentDBengkel)
    }

    fun onPengguna(view: View) {
        var intentPengguna = Intent(this, daftaruser::class.java)
        startActivity(intentPengguna)
    }
}