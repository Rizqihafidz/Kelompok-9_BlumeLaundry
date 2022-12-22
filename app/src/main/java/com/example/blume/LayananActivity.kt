package com.example.blume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LayananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)

        var paketBtn = findViewById<ImageButton>(R.id.layanan1)
        paketBtn.setOnClickListener {
            intent = Intent(this, PaketActivity::class.java)
            startActivity(intent)
        }
        var paketBtn2 = findViewById<ImageButton>(R.id.layanan2)
        paketBtn2.setOnClickListener {
            intent = Intent (this, SatuanActivity::class.java)
            startActivity(intent)
        }
    }
}