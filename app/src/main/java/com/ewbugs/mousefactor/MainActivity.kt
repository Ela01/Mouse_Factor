package com.ewbugs.mousefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.commit
import com.ewbugs.mousefactor.databinding.ActivityMainBinding
import com.ewbugs.mousefactor.kcal.KcalFragment
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(), NavigationBarView.OnItemReselectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener(this)
    }
    private fun onKcalClicked(): Boolean {

        supportFragmentManager.commit {
            //'add' will put one frame layout on top of the other. We don't want this
            replace(R.id.fragment_content, KcalFragment())
        }
        return true
    }

//    override fun onNavigationItemSelected(item: MenuItem) = when (item.itemId){
//        R.id.nav_ic_bmr_bmi -> onKcalClicked()
//        R.id.nav_ic_mouse -> onMouseClicked()
//
//        else -> false
//    }

//    private fun onMouseClicked(): Boolean {
//        supportFragmentManager.commit {
//            replace(R.id.fragment_content, MouseFragment())
//        }
//        return true
//
//    }


}