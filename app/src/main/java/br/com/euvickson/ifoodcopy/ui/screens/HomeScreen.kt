package br.com.euvickson.ifoodcopy.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.ui.components.RestaurantList
import br.com.euvickson.ifoodcopy.ui.components.TabBar
import br.com.euvickson.ifoodcopy.ui.components.icons.RestaurantDetailCard
import br.com.euvickson.ifoodcopy.ui.components.lists.CardList
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfIconsSample
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfProfileSample
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfRestaurantSample

@Composable
fun StartScreen() {
    Column (verticalArrangement = Arrangement.spacedBy(5.dp)) {
        TabBar(tabBarIcons = listOfIconsSample)
        CardList()
        RestaurantList(listOfProfileSample)
        RestaurantDetailCard(restaurant = listOfRestaurantSample[0])
    }
}

@Preview(showSystemUi = true)
@Composable
fun StartScreenPreview() {
    StartScreen()
}