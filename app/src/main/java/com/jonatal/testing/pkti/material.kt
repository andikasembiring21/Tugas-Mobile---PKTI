package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.tampung_material.*

class material : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material)

        toolbar = findViewById(R.id.toolbar_material)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.nav_home -> {
//                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
//            }
            R.id.nav_bahasa -> {
                Toast.makeText(this, "Bahasa clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_addfriend -> {
                Toast.makeText(this, "AddFriends clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_bantuan -> {
                Toast.makeText(this, "Bantuan clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_star -> {
                Toast.makeText(this, "Star clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_exit -> {
                Toast.makeText(this, "Exit clicked", Toast.LENGTH_SHORT).show()
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    fun onHomes3(view: View) {
        var intentHomes3 = Intent(this, home::class.java)
        startActivity(intentHomes3)
    }
//    fun onBengkel2(view: View) {
//        var intentBengkel2 = Intent(this, terdekatbengkel::class.java)
//        startActivity(intentBengkel2)
//    }
    fun onHins4(view: View) {
        var intenthins4 = Intent(this, riwayatpemesanan::class.java)
        startActivity(intenthins4)
    }

    fun onBengkelUser(view: View) {
        var intentBengkelUser = Intent(this, terdekatbengkel::class.java)
        startActivity(intentBengkelUser)
    }
}