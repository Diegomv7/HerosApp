package com.example.heroesapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R

class HomeActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logoutBtn : ImageView
    lateinit var dcBtn : ImageButton
    lateinit var marvelBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        username = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutbtn)
        dcBtn = findViewById(R.id.dcBtn)
        marvelBtn = findViewById(R.id.marvelBtn)


        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        dcBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, HeroesActivity::class.java)
            startActivity(intent)
            finish()
        }
        marvelBtn.setOnClickListener {
            val intent = Intent(this@HomeActivity, HeroesActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

