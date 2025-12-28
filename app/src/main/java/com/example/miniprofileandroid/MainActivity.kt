package com.example.miniprofileandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        openInfoFragment("Welcome!! \n Press back to continue")

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId){
                R.id.personal_info -> openInfoFragment("Ayon Pogi")
                R.id.notification -> openInfoFragment("Walang notif")
                R.id.time_spent -> openInfoFragment("9 hrs?")
                R.id.following -> openInfoFragment("not a stalker, 0 following")
            }
            true
        }

        val buttonMessages = mapOf(
            R.id.linkbutton to "No Uploaded Portfolio yet",
            R.id.seeInfo1 to "Ayon Pogi",
            R.id.seeInfo2 to "Walang notif",
            R.id.seeInfo3 to "9 hrs?",
            R.id.seeInfo4 to "not a stalker, 0 following",
            R.id.seeInfo5 to "Very Private",
            R.id.seeInfo6 to "Too long to read",
            R.id.seeInfo7 to "Help ME!!!!",
            R.id.logout to "Exiting",
        )

        buttonMessages.forEach { (buttonId, message) ->
            findViewById<Button>(buttonId).setOnClickListener {
                openInfoFragment(message)
            }
        }
    }
    private fun openInfoFragment(message:String){
        val fragment = InfoFragment()
            fragment.arguments = Bundle().apply{
                putString("message", message)
            }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
