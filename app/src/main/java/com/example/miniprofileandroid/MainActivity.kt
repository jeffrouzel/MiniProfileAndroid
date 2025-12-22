package com.example.miniprofileandroid

import android.icu.text.IDNA
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        val fragment = InfoFragment().apply{
            arguments = Bundle().apply{
                putString("message", message)
            }
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
