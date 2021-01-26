package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_daftaruser.*
import kotlinx.android.synthetic.main.activity_log_in.*

class daftaruser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftaruser)

        setSupportActionBar(DaftarUser_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onLanjut2(view: View) {
        var intentLanjut2 = Intent(this, verifikasi_user::class.java)
        startActivity(intentLanjut2)
    }
}