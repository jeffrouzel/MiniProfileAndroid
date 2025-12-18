package com.example.miniprofileandroid

import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_link = findViewById<Button>(R.id.linkbutton)
        val btn_cInfo1 = findViewById<Button>(R.id.seeInfo1)
        val btn_cInfo2 = findViewById<Button>(R.id.seeInfo2)
        val btn_cInfo3 = findViewById<Button>(R.id.seeInfo3)
        val btn_cInfo4 = findViewById<Button>(R.id.seeInfo4)
        val btn_cInfo5 = findViewById<Button>(R.id.seeInfo5)
        val btn_cInfo6 = findViewById<Button>(R.id.seeInfo6)
        val btn_cInfo7 = findViewById<Button>(R.id.seeInfo7)
        val btn_logout = findViewById<Button>(R.id.logout)

        btn_link.setOnClickListener{
            Toast.makeText(this, "No Uploaded Portfolio yet", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo1.setOnClickListener{
            Toast.makeText(this, "Ayon Pogi", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo2.setOnClickListener{
            Toast.makeText(this, "Walang notif", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo3.setOnClickListener{
            Toast.makeText(this, "9 hrs?", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo4.setOnClickListener{
            Toast.makeText(this, "not a stalker, 0 following", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo5.setOnClickListener{
            Toast.makeText(this, "Very Private", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo6.setOnClickListener{
            Toast.makeText(this, "Too long to read", Toast.LENGTH_SHORT).show()
        }
        btn_cInfo7.setOnClickListener{
            Toast.makeText(this, "Help ME!!!!", Toast.LENGTH_SHORT).show()
        }
        btn_logout.setOnClickListener{
            Toast.makeText(this, "EXITING", Toast.LENGTH_SHORT).show()
        }
    }
}
