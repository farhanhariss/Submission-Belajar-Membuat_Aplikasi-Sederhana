package com.dicoding.animalapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(
    var nameAnimals: String,
    var detailAnimals: String,
    var photoAnimals: Int,
) : Parcelable