package com.example.heroesapp.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroes
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter (val publishers: List<Publisher>, val onClick: (Publisher)->Unit) : RecyclerView.Adapter<PublisherViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publishers[position]
        Picasso.get().load(publisher.Image).into(holder.publisherImage)
        holder.itemView.setOnClickListener{
            Log.i("Hero",publisher.Name)
            onClick(publisher)
        }
    }

}

class PublisherViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val publisherImage : ImageView = view.findViewById(R.id.publisher_image)
}