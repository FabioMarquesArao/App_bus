package com.example.app_bus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.button4
import kotlinx.android.synthetic.main.activity_main_congonhas.*

class MainActivity_congonhas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_congonhas)
        setSupportActionBar(findViewById(R.id.toolbar5))

        button23.setOnClickListener {
            openNextActivit5() }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.menu_principal, menu)
        return true }

    private fun openNextActivit5() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }
}