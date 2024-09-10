package com.example.heroesapp.models

data class User(val email : String, val password : String){
    companion object{
        val staticUsers = listOf(
            User("diego@email.com", "1234"),
            User("hola@email.com", "1234"),
            User("adios@email.com", "1234")
        )

    }
}
