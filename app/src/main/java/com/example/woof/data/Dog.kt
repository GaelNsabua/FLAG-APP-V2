package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R


data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)

val dogs = listOf(
    Dog(R.drawable.country_france, R.string.country_france, R.string.country_description_1),
    Dog(R.drawable.country_germany, R.string.country_germany, R.string.country_description_2),
    Dog(R.drawable.country_usa, R.string.country_usa,R.string.country_description_3),
    Dog(R.drawable.country_japan, R.string.country_japan, R.string.country_description_4),
    Dog(R.drawable.country_canada, R.string.country_canada,R.string.country_description_5),
    Dog(R.drawable.country_brazil, R.string.country_brazil,R.string.country_description_6),
    Dog(R.drawable.country_australia, R.string.country_australia, R.string.country_description_7),
    Dog(R.drawable.country_india, R.string.country_india, R.string.country_description_8),
    Dog(R.drawable.country_south_africa, R.string.country_south_africa,  R.string.country_description_9),
    Dog(R.drawable.country_drc, R.string.country_drc,  R.string.country_description_10),
    Dog(R.drawable.country_china, R.string.country_china,  R.string.country_description_10)
)
