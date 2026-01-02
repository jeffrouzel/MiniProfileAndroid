package com.example.miniprofileandroid

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerSettings)
        val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerHaS)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        recyclerView2.layoutManager = LinearLayoutManager(this)

        val infolbl_1 = listOf("Personal Information", "Notifications", "Time Spent", "Following")
        val infolbl_2 = listOf("Privacy Policy", "Terms and Conditions", "FAQ and Help")

        recyclerView1.adapter = MyAdapter(infolbl_1) { clickedItem ->
            val message = when (clickedItem) {
                "Personal Information" -> "Ayon Pogi"
                "Notifications" -> "Walang notif"
                "Time Spent" -> "9 hrs?"
                "Following" -> "not a stalker, 0 following"
                else -> ""
            }
            openInfoFragment(message)
        }

        recyclerView2.adapter = MyAdapter(infolbl_2) { clickedItem ->
            val message = when (clickedItem) {
                "Privacy Policy" -> "Very Private"
                "Terms and Conditions" -> "Too long to read"
                "FAQ and Help" -> "Help ME!!!!"
                else -> ""
            }
            openInfoFragment(message)
        }

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
