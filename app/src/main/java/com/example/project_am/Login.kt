package com.example.project_am

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        editTextUsername = findViewById(R.id.edit_email)
        editTextPassword = findViewById(R.id.edit_password)

        btnLogin.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_login -> {
                val username = editTextUsername.text.toString().trim()
                val password = editTextPassword.text.toString().trim()

                if (ValidasiLogin(username, password)) {
                    val intent = Intent(this, Dashboard_SA::class.java)
                    intent.putExtra("username", username)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Username atau password tidak valid. Silakan cek kembali.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun ValidasiLogin(username: String, password: String): Boolean {
        val validCredentials = mapOf(
            "Fahriza" to "password1",
            "Dinda" to "password2",
            "Royyan" to "password3"
        )

        return validCredentials[username] == password
    }
}
