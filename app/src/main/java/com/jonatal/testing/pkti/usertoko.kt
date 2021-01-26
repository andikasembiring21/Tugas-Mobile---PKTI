package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_usermaterial.*
import kotlinx.android.synthetic.main.activity_usertoko.*

class usertoko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usertoko)

        setSupportActionBar(usrToko_Toolbar)
        supportActionBar?.apply {

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

    fun onMaterial2(view: View) {
        var intentmat = Intent(this, usermaterial::class.java)
        startActivity(intentmat)
    }

    fun onhstory(view: View) {
        var intentHst = Intent(this, riwayatpemesanan::class.java)
        startActivity(intentHst)
    }
    fun onHome(view: View) {
        var intentHom = Intent(this, home::class.java)
        startActivity(intentHom)
    }

    fun onPesanPagar(view: View) {
        var intentPesanpgr = Intent(this, konfirmasi_pemesanan::class.java)
        startActivity(intentPesanpgr)
    }
}