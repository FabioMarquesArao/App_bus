package com.example.app_bus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_congonhas.*

class MainActivityCongonhas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_congonhas)

        mp8= MediaPlayer.create(this, R.raw.ola)
        mp9 = MediaPlayer.create(this, R.raw.tiete)
        mp10 = MediaPlayer.create(this, R.raw.vinte)
        mp11= MediaPlayer.create(this, R.raw.paraiso)
        mp12= MediaPlayer.create(this, R.raw.congonhas)

        button23.setOnClickListener {
            openNextActivit5()
            mp8.stop()
            mp9.stop()
            mp10.stop()
            mp11.stop()
            mp12.stop()
        }
    }
    private lateinit var mp8: MediaPlayer
    private lateinit var mp9: MediaPlayer
    private lateinit var mp10: MediaPlayer
    private lateinit var mp11: MediaPlayer
    private lateinit var mp12: MediaPlayer

    fun buttonViagem2(v: View) {
        when {
            mp8.isPlaying -> {
                mp8.stop()
                mp8 = MediaPlayer.create(this, R.raw.ola)
            }
            mp9.isPlaying -> {
                mp9.stop()
                mp8= MediaPlayer.create(this, R.raw.ola)
            }
            mp10.isPlaying -> {
                mp10.stop()
                mp8= MediaPlayer.create(this, R.raw.ola)
            }
            mp11.isPlaying -> {
                mp11.stop()
                mp8= MediaPlayer.create(this, R.raw.ola)
            }
            mp12.isPlaying -> {
                mp12.stop()
                mp8= MediaPlayer.create(this, R.raw.ola)
            }
        }
        mp8.start()
    }
    fun buttonTiete2(v: View) {
        when {
            mp9.isPlaying -> {
                mp9.stop()
                mp9= MediaPlayer.create(this, R.raw.tiete)
            }
            mp10.isPlaying -> {
                mp10.stop()
                mp9= MediaPlayer.create(this, R.raw.tiete)
            }
            mp11.isPlaying -> {
                mp11.stop()
                mp9= MediaPlayer.create(this, R.raw.tiete)
            }
            mp12.isPlaying -> {
                mp12.stop()
                mp9= MediaPlayer.create(this, R.raw.tiete)
            }
            mp8.isPlaying -> {
                mp8.stop()
                mp9= MediaPlayer.create(this, R.raw.tiete)
            }
        }
        mp9.start()
    }

    fun buttonVinte2(v: View) {
        when {
            mp10.isPlaying -> {
                mp10.stop()
                mp10 = MediaPlayer.create(this, R.raw.vinte)
            }
            mp11.isPlaying -> {
                mp11.stop()
                mp10= MediaPlayer.create(this, R.raw.vinte)
            }
            mp12.isPlaying -> {
                mp12.stop()
                mp10= MediaPlayer.create(this, R.raw.vinte)
            }
            mp8.isPlaying -> {
                mp8.stop()
                mp10= MediaPlayer.create(this, R.raw.vinte)
            }
            mp9.isPlaying -> {
                mp9.stop()
                mp10= MediaPlayer.create(this, R.raw.vinte)
            }
        }
        mp10.start()
    }

    fun buttonParaiso2(v: View) {
        when {
            mp11.isPlaying -> {
                mp11.stop()
                mp11 = MediaPlayer.create(this, R.raw.paraiso)
            }
            mp12.isPlaying -> {
                mp12.stop()
                mp11= MediaPlayer.create(this, R.raw.paraiso)
            }
            mp8.isPlaying -> {
                mp8.stop()
                mp11= MediaPlayer.create(this, R.raw.paraiso)
            }
            mp9.isPlaying -> {
                mp9.stop()
                mp11= MediaPlayer.create(this, R.raw.paraiso)
            }
            mp10.isPlaying -> {
                mp10.stop()
                mp11= MediaPlayer.create(this, R.raw.paraiso)
            }
        }
        mp11.start()
    }

    fun buttonCongonhas2(v: View) {
        when {
            mp12.isPlaying -> {
                mp12.stop()
                mp12= MediaPlayer.create(this, R.raw.congonhas)
            }
            mp8.isPlaying -> {
                mp8.stop()
                mp12= MediaPlayer.create(this, R.raw.congonhas)
            }
            mp9.isPlaying -> {
                mp9.stop()
                mp12= MediaPlayer.create(this, R.raw.congonhas)
            }
            mp10.isPlaying -> {
                mp10.stop()
                mp12= MediaPlayer.create(this, R.raw.congonhas)
            }
            mp11.isPlaying -> {
                mp11.stop()
                mp12= MediaPlayer.create(this, R.raw.congonhas)
            }
        }
        mp12.start()
    }

    private fun openNextActivit5() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }
}