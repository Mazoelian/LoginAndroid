package com.example.loginsederhana

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var loginView: TextView
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginView = findViewById(R.id.loginView)
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
    }

    fun login(view: View?) {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        when {
            (username.equals("Rayan", ignoreCase = true) && password.equals(
                "12345678",
                ignoreCase = true
            )) ||
                    (username.equals("Amel", ignoreCase = true) && password.equals(
                        "12345679",
                        ignoreCase = true
                    )) ||
                    (username.equals("Bella", ignoreCase = true) && password.equals(
                        "12345670",
                        ignoreCase = true
                    )) ||
                    (username.equals("Rafi", ignoreCase = true) && password.equals(
                        "12345671",
                        ignoreCase = true
                    )) ||
                    (username.equals("Reza", ignoreCase = true) && password.equals(
                        "12345672",
                        ignoreCase = true
                    )) -> {

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("username", username)
                intent.putExtra("password", password)
                startActivity(intent)
            }

            else -> {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}