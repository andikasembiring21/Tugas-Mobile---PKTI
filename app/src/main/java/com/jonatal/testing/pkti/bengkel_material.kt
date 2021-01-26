package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bengkel_material : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bengkel_material)
    }

    fun onJasa(view: View) {
        var intentJas = Intent(this, bengkel::class.java)
        startActivity(intentJas)
    }
    fun onhstory(view: View) {
        var intentht = Intent(this, history::class.java)
        startActivity(intentht)
    }
    fun onhoms(view: View) {
        var intenthom = Intent(this, home::class.java)
        startActivity(intenthom)
    }

    fun onPsan(view: View) {
        var intentPsn = Intent(this, pesanan::class.java)
        startActivity(intentPsn)
    }

    fun onHins(view: View) {
        var intenths = Intent(this, notifikasi::class.java)
        startActivity(intenths)
    }
}