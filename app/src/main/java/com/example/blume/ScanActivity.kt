package com.example.blume

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ScanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)

        var ScanBtn = findViewById<ImageButton>(R.id.scanBtn)
        ScanBtn.setOnClickListener {
            intent = Intent (this, KonfirmasiActivity::class.java)
            startActivity(intent)
        }
        var BackBtn = findViewById<Button>(R.id.backBtn)
        BackBtn.setOnClickListener {
            intent = Intent (this, LayananActivity::class.java)
            startActivity(intent)
        }
    }
    }
