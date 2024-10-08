package com.example.heroesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.heroesapp.models.User
import com.example.heroesapp.ui.PublisherActivity

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn: Button
    lateinit var usrEdText: EditText
    lateinit var passwordEdText: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val islogged = sharedPreferences.getBoolean("islogged", false)
        val intent = Intent(this@MainActivity, PublisherActivity::class.java)

        if (islogged) {
            startActivity(intent)
            finish()
        }


        loginBtn = findViewById(R.id.loginBtn)
        usrEdText = findViewById(R.id.usrEdText)
        passwordEdText = findViewById(R.id.passwordEdText)
        loginBtn.setOnClickListener {
            Log.i("LOGAPP","Iniciar Sesion")
            val email = usrEdText.text.toString()
            val password = passwordEdText.text.toString()
            Log.i("EMAIL",email)
            Log.i("PASSWORD",password)
            if (email.isEmpty() || password.isEmpty()) {
                Log.i("ERROR","El correo electroico o la contraseña estan mal")
                return@setOnClickListener
            }
            val isValidUser = User.staticUsers.any{ user -> user.email == email && user.password == password}
            if (!isValidUser) {
                Log.i("ERROR","El correo electroico o la contraseña estan mal")
                return@setOnClickListener
            }
            val user = User.staticUsers.firstOrNull{ user -> user.email == email && user.password == password}
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()

            intent.putExtra("userEmail", user?.email)
            startActivity(intent)
            finish()
        }
    }
}