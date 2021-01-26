package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.activity_usermaterial.*

class usermaterial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usermaterial)


        setSupportActionBar(usrMaterial_Toolbar)

        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onJasa2(view: View) {
        var intentJs = Intent(this, usertoko::class.java)
        startActivity(intentJs)
    }

    fun onHome2(view: View) {
        var intentho2 = Intent(this, home::class.java)
        startActivity(intentho2)
    }
}