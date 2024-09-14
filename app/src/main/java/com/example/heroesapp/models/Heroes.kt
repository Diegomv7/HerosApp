package com.example.heroesapp.models

import java.util.Locale.Category

data class Heroes(val idPublisher: Int,val name: String, val imgen: String){
    companion object {
        val Heroes = mutableListOf<Heroes>(
            Heroes(1,"Capitan America", "adfsaf"),
            Heroes(1,"Ironman", "https://w7.pngwing.com/pngs/138/581/png-transparent-iron-man-thor-captain-america-comics-superhero-ironman-comics-avengers-heroes.png"),
            Heroes(1,"Hulk", "adfsaf"),
            Heroes(1,"Hawkeye", "adfsaf"),
            Heroes(1,"Blackwidow", "adfsaf"),
            Heroes(1,"Spider-Man", "adfsaf"),
            Heroes(2,"Batman", "adfsaf"),
            Heroes(2,"Flash", "adfsaf"),
            Heroes(2,"Aquaman", "adfsaf"),
            Heroes(2,"Superman", "adfsaf"),
            Heroes(2,"Wonder Woman", "adfsaf"),



        )
    }
}
