package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_log_in.*

class log_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        setSupportActionBar(Log_Toolbar)

        supportActionBar?.apply {
            title = "Masuk"

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onLogin(view: View) {
        var intentLog = Intent(this, home::class.java)
        startActivity(intentLog)
    }

    fun onLoginBengkel(view: View) {
        var intentlogbengkel = Intent(this, bengkel::class.java)
        startActivity(intentlogbengkel)
    }

}