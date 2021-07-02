package com.gsrathoreniks.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gsrathoreniks.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupViews()
    }

    private fun setupViews() {
        binding.apply {

            btnEnglish.setOnClickListener {
                setAppLocale(this@MainActivity, ENGLISH)
                restartActivity()
            }

            btnHindi.setOnClickListener {
                setAppLocale(this@MainActivity, HINDI)
                restartActivity()
            }

        }
    }

    private fun restartActivity() {
        finish()
        startActivity(intent)
    }
}