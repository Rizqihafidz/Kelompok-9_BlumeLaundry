package com.example.blume

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class KonfirmasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        var backBtn = findViewById<Button>(R.id.backBtn)
        backBtn.setOnClickListener {
            intent = Intent(this, LayananActivity::class.java)
            startActivity(intent)
        }
    }
}