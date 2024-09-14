package com.example.heroesapp.models

data class Publisher(val id : Int, val Name : String, val Image: String){
    companion object{
        val Publishers = mutableListOf<Publisher>(
            Publisher(1,"DC", "https://upload.wikimedia.org/wikipedia/commons/1/1c/DC_Comics_logo.png"),
            Publisher(2,"Marvel", "https://static.vecteezy.com/system/resources/previews/019/909/416/non_2x/marvel-transparent-marvel-free-free-png.png")
        )
    }
}