package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  NameCard = findViewById<CardView>(R.id.name)
        NameCard.setOnClickListener {
            startActivity(Intent( this, NameActivity::class.java))
        }
        val  Lottocard = findViewById<CardView>(R.id.lottoCard)
        Lottocard.setOnClickListener {
            startActivity(Intent( this, ResultActivity::class.java))
        }
        val  Constellcard = findViewById<CardView>(R.id.Constellation)
        Constellcard.setOnClickListener {
            startActivity(Intent( this, ConstellationActivity::class.java))
        }


    }
}