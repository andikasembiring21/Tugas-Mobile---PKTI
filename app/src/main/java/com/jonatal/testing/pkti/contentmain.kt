package com.jonatal.testing.pkti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jonatal.testing.pkti.fragments.BengkelFragment
import com.jonatal.testing.pkti.fragments.HistoryFragment
import com.jonatal.testing.pkti.fragments.HomeFragment
import com.jonatal.testing.pkti.fragments.MaterialFragment

class contentmain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contentmain)
        //      bagian navigationbottom
//        val homeFragment = HomeFragment()
//        val materialFragment = MaterialFragment()
//        val bengkelFragment = BengkelFragment()
//        val historyFragment = HistoryFragment()

//        makeCurrentFragment(homeFragment)

//        bottom_navigations.setOnNavigationItemSelectedListener{ it: MenuItem
//            when(it.itemId){
//                R.id.ic_home -> makeCurrentFragment(homeFragment)
//                R.id.ic_info_barang -> makeCurrentFragment(materialFragment)
//                R.id.ic_bengkel -> makeCurrentFragment(bengkelFragment)
//                R.id.ic_history -> makeCurrentFragment(historyFragment)
//            }
//            true
//        }

    }
//      function makeCurrent bagian navbottom
//    private fun makeCurrentFragment(fragment: Fragment) =
//        supportFragmentManager.beginTransaction().apply { replace(R.id.fl_wrapper, fragment)
//            commit()
//        }
}