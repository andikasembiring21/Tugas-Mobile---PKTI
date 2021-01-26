package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_verifikasi_user.*
import kotlinx.android.synthetic.main.activity_verifikasibengkel.*

class verifikasibengkel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasibengkel)


        setSupportActionBar(VerifikasiBengkel_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onLanjutVerif2(view: View) {
        var intentLanjutVerif2 = Intent(this, verifikasi_suksesbengkel::class.java)
        startActivity(intentLanjutVerif2)
    }

}