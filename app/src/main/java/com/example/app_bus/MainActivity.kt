package com.example.app_bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            openNextActivit() }

        button2.setOnClickListener {
            openNextActivit2() }

        button3.setOnClickListener {
            openNextActivit3() }

        button4.setOnClickListener {
            openNextActivit4() }
    }


    private fun openNextActivit() {
        val intent = Intent(this, MainActivityCongonhas::class.java)
        startActivity(intent) }

    private fun openNextActivit2() {
        val intent = Intent(this, MainActivity5BarraFunda::class.java)
        startActivity(intent) }

    private fun openNextActivit3() {
        val intent = Intent(this, MainActivity4AvPaulista::class.java)
        startActivity(intent)}

    private fun openNextActivit4() {
        val intent = Intent(this, MainActivity3Guarulhos::class.java)
        startActivity(intent) }



}
