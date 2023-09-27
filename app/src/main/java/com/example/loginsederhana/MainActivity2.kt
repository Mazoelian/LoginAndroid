package com.example.loginsederhana

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    private lateinit var profileImageView: ImageView
    private lateinit var usernameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        profileImageView = findViewById(R.id.profileImageView)
        usernameTextView = findViewById(R.id.usernameTextView)

        val intent = intent
        if (intent != null) {
            val username = intent.getStringExtra("username")
            val password = intent.getStringExtra("password")
            usernameTextView.text = "Hai selamat datang $username !!"


            val profileImageResource = when {
                username.equals("Rayan", ignoreCase = true) && password == "12345678" -> R.drawable.rayan_profile_image
                username.equals("Amel", ignoreCase = true) && password == "12345679" -> R.drawable.amel_profile_image
                username.equals("Bella", ignoreCase = true) && password == "12345670" -> R.drawable.bella_profile_image
                username.equals("Rafi", ignoreCase = true) && password == "12345671" -> R.drawable.rafi_profile_image
                username.equals("Reza", ignoreCase = true) && password == "12345672" -> R.drawable.reza_profile_image
                else-> {
                    Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
                    R.drawable.rayan_profile_image
                }
            }
            profileImageView.setImageResource(profileImageResource)
        }

    }

    fun goBack(view: View?) {
        finish() // Kembali ke halaman sebelumnya
    }
}