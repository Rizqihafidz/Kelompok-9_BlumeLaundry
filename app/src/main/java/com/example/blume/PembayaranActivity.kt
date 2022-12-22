package com.example.blume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*

class PembayaranActivity : AppCompatActivity() {

    private lateinit var harga : TextView
    private lateinit var pajakv : TextView
    private lateinit var tobay : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        var total = intent.getFloatExtra("total", 0.0f)
        var pajak = total * 0.1f
        var totalBayar = total + pajak

        harga = findViewById(R.id.tv_total)
        pajakv = findViewById(R.id.tv_pajak)
        tobay = findViewById(R.id.tv_totalBayar)

        harga.text = "Rp. "+total.toInt().toString()
        pajakv.text = "Rp. "+pajak.toInt().toString()
        tobay.text = "Rp. "+totalBayar.toInt().toString()

        var BayarBtn = this.findViewById<Button>(R.id.bayarBtn)
        BayarBtn.setOnClickListener {

            var cardName = findViewById<EditText>(R.id.inputCardName)
            var cardNum = findViewById<EditText>(R.id.inputCardNumber)
            var date = findViewById<EditText>(R.id.inputDate)
            var ccv = findViewById<EditText>(R.id.inputDate2)

            if (TextUtils.isEmpty(cardName.getText()) || TextUtils.isEmpty(cardNum.getText()) ||
                TextUtils.isEmpty(date.getText()) || TextUtils.isEmpty(ccv.getText())) {
                Toast.makeText(applicationContext,"Lengkapi informasi pembayaran!", Toast.LENGTH_SHORT).show()
            } else {
                intent = Intent (this, ScanActivity::class.java)
                startActivity(intent)
            }
        }
    }
}