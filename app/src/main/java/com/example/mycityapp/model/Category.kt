package com.example.mycityapp.model

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons

data class Category(
    @StringRes val city_place: Int,
    @DrawableRes val icon: Int
)
