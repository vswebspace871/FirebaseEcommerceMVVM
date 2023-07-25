package com.example.firebaseecommercemvvm.util

import android.view.View
import androidx.fragment.app.Fragment
import com.example.firebaseecommercemvvm.activities.ShoppingActivity
import com.example.firebaseecommercemvvm.R
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}