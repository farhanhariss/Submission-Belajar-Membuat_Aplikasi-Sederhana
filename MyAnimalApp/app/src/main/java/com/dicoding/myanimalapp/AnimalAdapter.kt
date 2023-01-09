package com.dicoding.myanimalapp

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.animalapp.Animal

class AnimalAdapter(private val context: Context, private val animal: List<Animal>, val listener: (Animal) -> Unit) :
    RecyclerView.Adapter <AnimalAdapter.AnimalViewHolder>(){

    class AnimalViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val nameAnimal = view.findViewById<TextView>(R.id.animalNames)
        val detailAnimal = view.findViewById<TextView>(R.id.animalDetails)
        val photoAnimal = view.findViewById<ImageView>(R.id.animalPhotos)

        fun BindView(animal: Animal, listener: (Animal) -> Unit) {
            photoAnimal.setImageResource(animal.photoAnimals)
            detailAnimal.text = animal.detailAnimals
            nameAnimal.text = animal.nameAnimals

            itemView.setOnClickListener{
                listener(animal)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_animal, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.BindView(animal[position],listener)




    }




    override fun getItemCount(): Int = animal.size

}