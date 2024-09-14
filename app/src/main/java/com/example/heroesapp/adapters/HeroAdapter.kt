package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroes
import com.squareup.picasso.Picasso

class HeroAdapter (val heroes: List<Heroes>) : RecyclerView.Adapter<HeroViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hero_item,parent,false)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.count()
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroes[position]
        holder.heroName.text = hero.name
        Picasso.get().load(hero.imgen).into(holder.heroImage)
    }

}

class HeroViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val heroImage : ImageView = view.findViewById(R.id.hero_image)
    val heroName : TextView = view.findViewById(R.id.heroe_name)
}