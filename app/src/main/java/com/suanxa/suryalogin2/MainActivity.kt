package com.suanxa.suryalogin2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput: EditText = findViewById(R.id.emailInput)
        val passwordInput: EditText = findViewById(R.id.passwordInput)
        val loginButton: Button = findViewById(R.id.loginButton)
        val forgotPassword: TextView = findViewById(R.id.forgotPassword)
        val signUp: TextView = findViewById(R.id.signUp)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
        }
        forgotPassword.setOnClickListener {
        }
        signUp.setOnClickListener {
        }
    }
}
