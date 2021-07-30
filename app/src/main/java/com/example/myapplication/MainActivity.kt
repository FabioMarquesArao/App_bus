package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    private lateinit var mp: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mp = MediaPlayer.create(this, R.raw.tete)

        button.setOnClickListener {
            openNextActivit() }

        button2.setOnClickListener {
            openNextActivit2() }

        button3.setOnClickListener {
            openNextActivit3() }

        button4.setOnClickListener {
            openNextActivit4() }
    }

    fun buttonClick(v: View) {
        mp.start()
    }

    private fun openNextActivit() {
        val intent = Intent(this, MainActivity_congonhas::class.java)
        startActivity(intent) }

    private fun openNextActivit2() {
        val intent = Intent(this, MainActivity5_BarraFunda::class.java)
        startActivity(intent) }

    private fun openNextActivit3() {
        val intent = Intent(this, MainActivity4_AvPaulista::class.java)
        startActivity(intent)}

    private fun openNextActivit4() {
        val intent = Intent(this, MainActivity3_Guarulhos::class.java)
        startActivity(intent)
    }

}