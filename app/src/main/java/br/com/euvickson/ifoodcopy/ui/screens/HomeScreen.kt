package br.com.euvickson.ifoodcopy.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.ui.components.RestaurantList
import br.com.euvickson.ifoodcopy.ui.components.TabBar
import br.com.euvickson.ifoodcopy.ui.components.lists.CardList
import br.com.euvickson.ifoodcopy.ui.components.lists.ListOfRestaurantDetailCard
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfIconsSample
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfProfileSample
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfRestaurantSample

@Composable
fun StartScreen() {
    Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
        ListOfRestaurantDetailCard(listOfRestaurants = listOfRestaurantSample)
    }
}

@Preview(showSystemUi = true)
@Composable
fun StartScreenPreview() {
    StartScreen()
}