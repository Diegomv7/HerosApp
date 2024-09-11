package com.example.heroesapp.ui

import android.content.Context
import android.os.Bundle
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

class HeroesActivity : AppCompatActivity() {
    lateinit var heroestitle : TextView
    lateinit var heroesRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)
       val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        heroestitle = findViewById(R.id.herosTitle)
        heroesRecyclerView = findViewById(R.id.heroesRecyclerView)
        heroesRecyclerView.adapter = HeroAdapter(Heroes.Heroes)
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}