package br.com.euvickson.ifoodcopy.model

import androidx.annotation.DrawableRes

class Restaurant(
    val name: String,
    val restaurantType: String = "",
    val superRestaurant: Boolean = false,
    @DrawableRes val logo: Int
)