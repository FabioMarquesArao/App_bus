package com.example.app_bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_activity3_guarulhos.*

class MainActivity4_AvPaulista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity4_av_paulista)

        button26.setOnClickListener {
            openNextActivit7() }
    }

    private fun openNextActivit7() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }
}