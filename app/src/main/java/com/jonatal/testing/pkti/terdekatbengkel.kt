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

class terdekatbengkel : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terdekatbengkel)


        toolbar = findViewById(R.id.toolbar_terdekat)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layoutterdekat)
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

    fun onHomes4(view: View) {
        var intentHomes4 = Intent(this, home::class.java)
        startActivity(intentHomes4)
    }
    fun onMaterial3(view: View) {
        var intentMaterial3 = Intent(this, material::class.java)
        startActivity(intentMaterial3)
    }
    fun onHins4(view: View) {
        var intentHins4 = Intent(this, riwayatpemesanan::class.java)
        startActivity(intentHins4)
    }

    fun onPemesanan(view: View) {
        var intentPemesanan = Intent(this, usertoko::class.java)
        startActivity(intentPemesanan)
    }
}