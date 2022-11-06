package br.com.euvickson.ifoodcopy.model

class Profile(
    val lastRestaurantList: List<Restaurant>?,
    val favoriteRestaurantList: List<Restaurant>? = null
)