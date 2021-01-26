package com.jonatal.testing.pkti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import com.jonatal.testing.pkti.fragments.BengkelFragment
import com.jonatal.testing.pkti.fragments.HistoryFragment
import com.jonatal.testing.pkti.fragments.HomeFragment
import com.jonatal.testing.pkti.fragments.MaterialFragment
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.fragment_bengkel.*
import kotlinx.android.synthetic.main.fragment_notifikasi.*

class home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


//        bagian menu
//        val homeFragment = HomeFragment()
////        val materialFragment = MaterialFragment()
//        val bengkelFragment = BengkelFragment()
//        val historyFragment = HistoryFragment()
//
//        makeCurrentFragment(homeFragment)
//
//        bottom_navigation.setOnNavigationItemSelectedListener {
//            when (it.itemId){
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


////    bagian menu makeCurrent
//        private fun makeCurrentFragment(fragment: Fragment)  =
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fl_wrapper, fragment)
//            commit()
//        }
//    fun onHistory(view: View) {
//        var intentHis = Intent(this, history::class.java)
//        startActivity(intentHis)
//    }
    fun onBengkelU(view: View) {
        var intentBeng = Intent(this, terdekatbengkel::class.java)
        startActivity(intentBeng)
    }
    fun onNotif(view: View) {
        var intentnof = Intent(this, notifikasi::class.java)
        startActivity(intentnof)
    }
    fun onMaterialUser(view: View) {
        var intentMaterialUser = Intent(this, material::class.java)
        startActivity(intentMaterialUser)
    }
    fun onHistor(view: View) {
        var intentHistor = Intent(this, riwayatpemesanan::class.java)
        startActivity(intentHistor)
    }
}
