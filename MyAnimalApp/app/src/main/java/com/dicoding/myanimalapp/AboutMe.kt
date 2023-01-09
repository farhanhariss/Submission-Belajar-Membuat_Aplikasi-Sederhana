package com.dicoding.myanimalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Me"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}