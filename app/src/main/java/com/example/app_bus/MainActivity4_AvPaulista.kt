package com.example.app_bus

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_activity3_guarulhos.*

class MainActivity4AvPaulista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity4_av_paulista)

        mp13 = MediaPlayer.create(this, R.raw.ola)
        mp14= MediaPlayer.create(this, R.raw.tiete)
        mp15 = MediaPlayer.create(this, R.raw.republica)
        mp16= MediaPlayer.create(this, R.raw.ibis)
        mp17= MediaPlayer.create(this, R.raw.renaiscensse)
        mp18 = MediaPlayer.create(this, R.raw.inter)
        mp19= MediaPlayer.create(this, R.raw.macksoud)

        button26.setOnClickListener {
            openNextActivit7()
            mp13.stop()
            mp14.stop()
            mp15.stop()
            mp16.stop()
            mp17.stop()
            mp18.stop()
            mp19.stop()
        }
    }
        private lateinit var mp13: MediaPlayer
        private lateinit var mp14: MediaPlayer
        private lateinit var mp15: MediaPlayer
        private lateinit var mp16: MediaPlayer
        private lateinit var mp17: MediaPlayer
        private lateinit var mp18: MediaPlayer
        private lateinit var mp19: MediaPlayer

        fun buttonOlla3(v: View) {
            when {
                mp13.isPlaying -> {
                    mp13.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp13 = MediaPlayer.create(this, R.raw.ola)
                }
            }
                mp13.start()
        }

        fun buttonTiete3(v: View) {
            when {
                mp14.isPlaying -> {
                    mp14.stop()
                    mp14 = MediaPlayer.create(this, R.raw.tiete)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp14 = MediaPlayer.create(this, R.raw.tiete)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp14 = MediaPlayer.create(this, R.raw.tiete)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp14 = MediaPlayer.create(this, R.raw.tiete)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp14= MediaPlayer.create(this, R.raw.tiete)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp14= MediaPlayer.create(this, R.raw.tiete)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp14= MediaPlayer.create(this, R.raw.tiete)
                }
            }
            mp14.start()
        }

        fun buttonRepublica3(v: View) {
            when {
                mp15.isPlaying -> {
                    mp15.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp15 = MediaPlayer.create(this, R.raw.republica)
                }
            }
            mp15.start()
        }

        fun buttonIbis3(v: View) {
            when {
                mp16.isPlaying -> {
                    mp16.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp16 = MediaPlayer.create(this, R.raw.ibis)
                }
            }
            mp16.start()
        }

        fun buttonRena3(v: View) {
            when {
                mp17.isPlaying -> {
                    mp17.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp17 = MediaPlayer.create(this, R.raw.renaiscensse)
                }
            }
            mp17.start()
        }
        fun buttonInter3(v: View) {
            when {
                mp18.isPlaying -> {
                    mp18.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp19.isPlaying -> {
                    mp19.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp18 = MediaPlayer.create(this, R.raw.inter)
                }
            }
        mp18.start()
        }
        fun buttonMack3(v: View) {
            when {
                mp19.isPlaying -> {
                    mp19.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp13.isPlaying -> {
                    mp13.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp14.isPlaying -> {
                    mp14.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp15.isPlaying -> {
                    mp15.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp16.isPlaying -> {
                    mp16.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp17.isPlaying -> {
                    mp17.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
                mp18.isPlaying -> {
                    mp18.stop()
                    mp19 = MediaPlayer.create(this, R.raw.macksoud)
                }
            }
            mp19.start()
        }
        private fun openNextActivit7() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }