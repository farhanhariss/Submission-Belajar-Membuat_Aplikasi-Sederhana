package com.dicoding.myanimalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.animalapp.Animal

class DetailAnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_animal)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val animal = intent.getParcelableExtra<Animal>(MainActivity.INTENT_DETAIL)

        val nameAnimals = findViewById<TextView>(R.id.animal_name)
        val detailAnimals = findViewById<TextView>(R.id.animal_detail)
        val photoAnimals = findViewById<ImageView>(R.id.animal_photo)

        val btnShare = findViewById<Button>(R.id.btn_share)
        val btnFavorite = findViewById<Button>(R.id.btn_favorite)


        btnShare.setOnClickListener{
            Toast.makeText(this,"You share this content!", Toast.LENGTH_SHORT).show()
        }

        btnFavorite.setOnClickListener{
            Toast.makeText(this,"Favorite this content!", Toast.LENGTH_SHORT).show()
        }

        photoAnimals.setImageResource(animal?.photoAnimals!!)
        nameAnimals.text = animal.nameAnimals
        detailAnimals.text = animal.detailAnimals
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


    
}