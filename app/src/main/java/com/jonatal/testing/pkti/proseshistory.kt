package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_history.*
import kotlinx.android.synthetic.main.activity_proseshistory.*

class proseshistory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proseshistory)

        setSupportActionBar(Proses_Toolbar)
        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onSelesai2(view: View) {
        var intentslesai = Intent(this, history::class.java)
        startActivity(intentslesai)
    }

    fun onHomes2(view: View) {
        var intentHom2 = Intent(this, bengkel::class.java)
        startActivity(intentHom2)
    }

    fun onPesanbengkel(view: View) {
        var intentPesanbngkl = Intent(this, pesanan::class.java)
        startActivity(intentPesanbngkl)
    }


}