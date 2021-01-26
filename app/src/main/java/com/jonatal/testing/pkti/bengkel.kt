package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jonatal.testing.pkti.fragments.PesananFragment

class bengkel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bengkel)
    }
    fun onHome(view: View) {
        var intentHm = Intent(this, home::class.java)
        startActivity(intentHm)
    }
    fun onhstory(view: View) {
        var intenths = Intent(this, history::class.java)
        startActivity(intenths)
    }
    fun onMaterial(view: View) {
        var intentma = Intent(this, bengkel_material::class.java)
        startActivity(intentma)
    }
    fun onPesan(view: View) {
        var intentaPn = Intent(this, pesanan::class.java)
        startActivity(intentaPn)
    }

//    fun onHins(view: View) {
//        var intentHins = Intent(this, history::class.java)
//        startActivity(intentHins)
//    }

    fun onHins2(view: View) {
        var intentHins = Intent(this, notifikasi::class.java)
        startActivity(intentHins)
    }
}