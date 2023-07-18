package com.example.firebaseecommercemvvm.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.OnBackInvokedDispatcher
import androidx.activity.OnBackPressedCallback
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.firebaseecommercemvvm.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {

//    private lateinit var navHostFragment: NavHostFragment

    //private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_FirebaseEcommerceMVVM)
        setContentView(R.layout.activity_login_register)


//        navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        /*navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment*/

        /*if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(
                OnBackInvokedDispatcher.PRIORITY_DEFAULT
            ) {
                handleBackButtonPressed()
            }
        } else {

            onBackPressedDispatcher.addCallback(
                this *//* lifecycle owner *//*,
                object : OnBackPressedCallback(true) {
                    override fun handleOnBackPressed() {
                        // Back is pressed... Finishing the activity
                        handleBackButtonPressed()
                    }
                })

        }*/
        //handling back button pressed
        /*if(Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher.registerOnBackInvokedCallback(
                OnBackInvokedDispatcher.PRIORITY_DEFAULT
            ) {
                handleBackButtonPressed()
            }
        } else {
            onBackPressedDispatcher.addCallback(
                this,
                object : OnBackPressedCallback(true){
                    override fun handleOnBackPressed() {
                        handleBackButtonPressed()
                    }

                }
            )
        }*/

    }

    /*private fun handleBackButtonPressed() {
        val currentFragment = findNavController(R.id.fragmentContainerView).currentDestination?.id

        currentFragment?.let {currentFragmentID ->
            if (currentFragmentID == R.id.introductionFragment) {
                finish()
            } else if (currentFragmentID == R.id.accountOptionsFragment) {
                navHostFragment.navController.popBackStack()
            }
        }

    }*/
}

/*  private fun handleBackButtonPressed() {
      //val currentFragment = findNavController(R.id.fragmentContainerView).currentDestination?.id
      val currentFragment = navHostFragment.navController.currentDestination?.id
      currentFragment?.let { currentFragmentID ->
          if (currentFragmentID == R.id.introductionFragment) {
              finish()
          } else if (currentFragmentID == R.id.accountOptionsFragment) {
              navHostFragment.navController.popBackStack()
          }
      }
  }*/