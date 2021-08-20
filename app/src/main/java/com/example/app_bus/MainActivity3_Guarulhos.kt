package com.example.app_bus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_activity3_guarulhos.*

class MainActivity3Guarulhos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_guarulhos)

        mp3 = MediaPlayer.create(this, R.raw.ola)
        mp4 = MediaPlayer.create(this, R.raw.tiete)
        mp5 = MediaPlayer.create(this, R.raw.republica)
        mp6 = MediaPlayer.create(this, R.raw.terminal2)
        mp7 = MediaPlayer.create(this, R.raw.terminal3)

        button24.setOnClickListener {
            openNextActivit8()
            mp3.stop()
            mp4.stop()
            mp5.stop()
            mp6.stop()
            mp7.stop()
        }


    }
    private lateinit var mp3: MediaPlayer
    private lateinit var mp4: MediaPlayer
    private lateinit var mp5: MediaPlayer
    private lateinit var mp6: MediaPlayer
    private lateinit var mp7: MediaPlayer


    fun buttonBoaViagem(v:View) {
        when {
            mp3.isPlaying -> {
                mp3.stop()
                mp3 = MediaPlayer.create(this, R.raw.ola)
            }
            mp4.isPlaying -> {
                mp4.stop()
                mp3= MediaPlayer.create(this, R.raw.ola)
            }
            mp5.isPlaying -> {
                mp5.stop()
                mp3= MediaPlayer.create(this, R.raw.ola)
            }
            mp6.isPlaying -> {
                mp6.stop()
                mp3= MediaPlayer.create(this, R.raw.ola)
            }
            mp7.isPlaying -> {
                mp7.stop()
                mp3= MediaPlayer.create(this, R.raw.ola)
            }
        }
        mp3.start()
    }

    fun buttonTiete(v:View) {
        when {
            mp4.isPlaying -> {
                mp4.stop()
                mp4 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp5.isPlaying -> {
                mp5.stop()
                mp4 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp6.isPlaying -> {
                mp6.stop()
                mp4 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp7.isPlaying -> {
                mp7.stop()
                mp7 = MediaPlayer.create(this, R.raw.tiete)
            }
            mp3.isPlaying -> {
                mp3.stop()
                mp4 = MediaPlayer.create(this, R.raw.tiete)
            }
        }
        mp4.start()
    }

    fun buttonRepublica(v:View) {
        when {
            mp5.isPlaying -> {
                mp5.stop()
                mp5 = MediaPlayer.create(this, R.raw.republica)
            }
            mp6.isPlaying -> {
                mp6.stop()
                mp5 = MediaPlayer.create(this, R.raw.republica)
            }
            mp7.isPlaying -> {
                mp7.stop()
                mp5 = MediaPlayer.create(this, R.raw.republica)
            }
            mp3.isPlaying -> {
                mp3.stop()
                mp5 = MediaPlayer.create(this, R.raw.republica)
            }
            mp4.isPlaying -> {
                mp4.stop()
                mp5 = MediaPlayer.create(this, R.raw.republica)
            }
        }
        mp5.start()
    }
    fun buttonTerminalDois(v: View) {
        when {
            mp6.isPlaying -> {
                mp6.stop()
                mp6 = MediaPlayer.create(this, R.raw.terminal2)
            }
            mp7.isPlaying -> {
                mp7.stop()
                mp6 = MediaPlayer.create(this, R.raw.terminal2)
            }
            mp3.isPlaying -> {
                mp3.stop()
                mp6 = MediaPlayer.create(this, R.raw.terminal2)
            }
            mp4.isPlaying -> {
                mp4.stop()
                mp6 = MediaPlayer.create(this, R.raw.terminal2)
            }
            mp5.isPlaying -> {
                mp5.stop()
                mp6 = MediaPlayer.create(this, R.raw.terminal2)
            }
        }
        mp6.start()
    }
    fun buttonTerminalTres(v: View) {
        when {
            mp7.isPlaying -> {
                mp7.stop()
                mp7 = MediaPlayer.create(this, R.raw.terminal3)
            }
            mp3.isPlaying -> {
                mp3.stop()
                mp7 = MediaPlayer.create(this, R.raw.terminal3)
            }
            mp4.isPlaying -> {
                mp4.stop()
                mp7 = MediaPlayer.create(this, R.raw.terminal3)
            }
            mp5.isPlaying -> {
                mp5.stop()
                mp7 = MediaPlayer.create(this, R.raw.terminal3)
            }
            mp6.isPlaying -> {
                mp6.stop()
                mp7 = MediaPlayer.create(this, R.raw.terminal3)
            }
        }
        mp7.start()
    }
    private fun openNextActivit8() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }


}