package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_daftarbengkel.*
import kotlinx.android.synthetic.main.activity_log_in.*

class daftarbengkel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftarbengkel)


        setSupportActionBar(DaftarBengkel_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
    fun onLanjut(view: View) {
        var intentLanjut = Intent(this, verifikasibengkel::class.java)
        startActivity(intentLanjut)
    }
}