package com.example.blume

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_login);

         var loginBtn = findViewById<Button>(R.id.loginBtn)
         loginBtn.setOnClickListener {

             var userName = findViewById<EditText>(R.id.inputEmail)
             var pwd = findViewById<EditText>(R.id.inputPassword)

             if (TextUtils.isEmpty(userName.getText()) || TextUtils.isEmpty(pwd.getText())) {
                 Toast.makeText(applicationContext,"Lengkapi informasi login!",Toast.LENGTH_SHORT).show()
             } else {
                 intent = Intent (this, LayananActivity::class.java)
                 startActivity(intent)
             }
         }

         var googleBtn = findViewById<Button>(R.id.googleSignin)
         googleBtn.setOnClickListener {
             intent = Intent (this, LayananActivity::class.java)
             startActivity(intent)
         }
     }
}

