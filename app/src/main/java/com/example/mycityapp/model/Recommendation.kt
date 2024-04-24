package com.example.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/*
* Data model for recommendation
* */

data class Recommendation(
    val city_place_id: Int,
    @StringRes val city_place: Int,
    @StringRes val city_place_add: Int,
    @StringRes val city_place_desc: Int,
    @DrawableRes val city_place_image: Int
)
