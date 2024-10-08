package com.example.heroesapp.ui

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroAdapter
import com.example.heroesapp.models.Heroes
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    lateinit var heroestitle : TextView
    lateinit var heroesRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
        val IdPublisher = intent.getIntExtra("IdPublisher", 0)


        val publisher = Publisher.Publishers.firstOrNull{ it.id == IdPublisher }

        val heroes = Heroes.Heroes.filter { it.idPublisher == IdPublisher }


        val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        heroestitle = findViewById(R.id.herosTitle)
        heroesRecyclerView = findViewById(R.id.heroesRecyclerView)
        heroesRecyclerView.adapter = HeroAdapter(heroes)
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}