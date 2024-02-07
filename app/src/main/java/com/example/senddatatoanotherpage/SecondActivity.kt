package com.example.senddatatoanotherpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var textuserName : TextView
    private lateinit var textPassword : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textuserName = findViewById(R.id.tv_username)
        textPassword = findViewById(R.id.tv_Password)

        val userName = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        textuserName.text = "Username : "+userName
        textPassword.text = "Password : "+password

    }
}