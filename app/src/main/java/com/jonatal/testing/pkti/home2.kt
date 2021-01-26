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
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.jonatal.testing.pkti.fragments.BengkelFragment
import com.jonatal.testing.pkti.fragments.HistoryFragment
import com.jonatal.testing.pkti.fragments.HomeFragment
import kotlinx.android.synthetic.main.content_main.*

class home2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

//        val homeFragment = HomeFragment()
////        val materialFragment = MaterialFragment()
//        val bengkelFragment = BengkelFragment()
//        val historyFragment = HistoryFragment()
//
//        makeCurrentFragment(homeFragment)

//        bottom_navigation.setOnNavigationItemSelectedListener {
//            when (it.itemId) {
//                R.id.ic_home -> makeCurrentFragment(homeFragment)
//
//                R.id.ic_bengkel -> makeCurrentFragment(bengkelFragment)
//                R.id.ic_history -> makeCurrentFragment(historyFragment)
//            }
//            true
//        }


        toolbar = findViewById(R.id.toolbar)
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


    //    bagian menu makeCurrent
//    private fun makeCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fl_wrapper, fragment)
//            commit()
//        }
    fun onNotif2(view: View) {
        var intentnot2 = Intent(this, notifikasi::class.java)
        startActivity(intentnot2)
    }
}
