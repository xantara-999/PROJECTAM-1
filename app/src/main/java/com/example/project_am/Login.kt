package com.example.project_am

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    lateinit var editTextUsername: EditText
    lateinit var editTextPassword: EditText
    lateinit var btnlogin: Button
    lateinit var progreslogin: ProgressDialog

    var firebaseAuth = FirebaseAuth.getInstance()

    override fun onStart() {
        super.onStart()
        if (firebaseAuth.currentUser!=null){
            startActivity(Intent(this,Dashboard_SA::class.java))
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        editTextUsername = findViewById(R.id.edit_email)
        editTextPassword = findViewById(R.id.edit_password)
        btnlogin = findViewById(R.id.btn_login)

        editTextPassword.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD

        progreslogin = ProgressDialog(this)
        progreslogin.setTitle("Anda Berhasil Login")
        progreslogin.setMessage("Silahkan Tunggu")

        btnlogin.setOnClickListener{
            if (editTextUsername.text.isNotEmpty()&&editTextPassword.text.isNotEmpty()){
                ProsesLogin()
            }else{
                Toast.makeText(this,"Silahkan Masukan Email dan Password Terlebih Dahulu", LENGTH_SHORT).show()
            }
        }
    }
    private fun ProsesLogin(){
        val email = editTextUsername.text.toString()
        val password = editTextPassword.text.toString()

        progreslogin.show()
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                startActivity(Intent(this,Dashboard_SA::class.java))
            }
            .addOnFailureListener { error ->
                Toast.makeText(this, error.localizedMessage, LENGTH_SHORT).show()
            }
            .addOnCompleteListener{
                progreslogin.dismiss()
            }
    }



}
