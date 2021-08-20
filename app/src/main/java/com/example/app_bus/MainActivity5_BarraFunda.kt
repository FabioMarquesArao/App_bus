package com.example.app_bus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_activity3_guarulhos.button25


class MainActivity5BarraFunda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity5_barra_funda)

        mp = MediaPlayer.create(this, R.raw.barra)
        mp1 = MediaPlayer.create(this, R.raw.ola)
        mp2 = MediaPlayer.create(this, R.raw.tiete)

        button25.setOnClickListener {
            openNextActivit6()
            mp.stop()
            mp1.stop()
            mp2.stop()
        }
    }

    private lateinit var mp: MediaPlayer
    private lateinit var mp1: MediaPlayer
    private lateinit var mp2: MediaPlayer

    fun buttonClick(v: View) {
        when {
            mp.isPlaying -> {
                mp.stop()
                mp = MediaPlayer.create(this, R.raw.barra)
            }
            mp1.isPlaying -> {
                mp1.stop()
                mp = MediaPlayer.create(this, R.raw.barra)
            }
            mp2.isPlaying -> {
                mp2.stop()
                mp = MediaPlayer.create(this, R.raw.barra)
            }
        }
        mp.start()
    }

    fun buttonClick1(v: View) {
        when {
            mp1.isPlaying -> {
                mp1.stop()
                mp1 = MediaPlayer.create(this, R.raw.ola)
            }
            mp.isPlaying -> {
                mp.stop()
                mp1 = MediaPlayer.create(this, R.raw.ola)
            }
            mp2.isPlaying -> {
                mp2.stop()
                mp1 = MediaPlayer.create(this, R.raw.ola)
            }
        }
        mp1.start()
    }

    fun buttonClick2(v: View) {
        when {
            mp2.isPlaying -> {
                mp2.stop()
                mp2 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp1.isPlaying -> {
                mp1.stop()
                mp2 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp.isPlaying -> {
                mp.stop()
                mp2 = MediaPlayer.create(this, R.raw.tiete)
            }
        }
        mp2.start()
    }

    private fun openNextActivit6() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }
}