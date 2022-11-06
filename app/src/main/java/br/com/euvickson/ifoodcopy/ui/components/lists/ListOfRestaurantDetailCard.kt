package br.com.euvickson.ifoodcopy.ui.components.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Restaurant
import br.com.euvickson.ifoodcopy.ui.components.icons.RestaurantDetailCard
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfRestaurantSample

@Composable
fun ListOfRestaurantDetailCard(listOfRestaurants: List<Restaurant>) {
    Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(text = "Lojas")
        LazyColumn (verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(listOfRestaurants) { restaurant ->
                RestaurantDetailCard(restaurant = restaurant)
            }
        }
    }
}

@Preview
@Composable
private fun ListOfRestaurantDetailCardPreview() {
    ListOfRestaurantDetailCard(listOfRestaurants = listOfRestaurantSample)
}