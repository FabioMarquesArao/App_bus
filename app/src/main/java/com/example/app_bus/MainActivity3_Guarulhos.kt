package com.example.app_bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activity3_guarulhos.*

class MainActivity3_Guarulhos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_guarulhos)

        button24.setOnClickListener {
            openNextActivit8() }
    }
    private fun openNextActivit8() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }


}