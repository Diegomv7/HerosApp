package com.example.heroesapp.models

import java.util.Locale.Category

data class Heroes(val id: Int,val name: String, val imgen: String){
    companion object {
        val Heroes = mutableListOf<Heroes>(
            Heroes(1,"Capitan America", "adfsaf"),
            Heroes(2,"Ironman", "adfsaf"),
            Heroes(3,"Hulk", "adfsaf"),
            Heroes(4,"Hawkeye", "adfsaf"),
            Heroes(5,"Blackwidow", "adfsaf"),
            Heroes(6,"Spider-Man", "adfsaf"),
            Heroes(7,"Dr Strange", "adfsaf"),
            Heroes(8,"Thor", "adfsaf"),
            Heroes(9,"Thanos", "adfsaf"),

        )
    }
}
