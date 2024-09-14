package com.example.heroesapp.models

data class User(val name : String, val email : String, val password : String){
    companion object{
        val staticUsers = listOf(
            User("Diego","diego@email.com", "1234"),
            User("Profe","profe@email.com", "1234"),
            User("Samuel","samuel@email.com", "1234")
        )

    }
}
