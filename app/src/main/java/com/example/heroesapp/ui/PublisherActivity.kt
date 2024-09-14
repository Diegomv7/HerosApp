package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {
    lateinit var username : TextView
    lateinit var logoutBtn : ImageView
    lateinit var publisherRecyclerview : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val userEmail = intent.getStringExtra("userEmail")
        val user = User.staticUsers.firstOrNull{ it.email == userEmail }
        username = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutbtn)
        username.text = user?.name
        publisherRecyclerview = findViewById(R.id.publisherRecyclerview)
        publisherRecyclerview.adapter = PublisherAdapter(Publisher.Publishers){publisher -> Log.i("PublisherActivity", publisher.Name)
        val intent = Intent(this@PublisherActivity, HeroesActivity::class.java).apply {
            putExtra("IdPublisher", publisher.id)
        }
            startActivity(intent)
        }
        publisherRecyclerview.layoutManager = GridLayoutManager(this, 1)


        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}

