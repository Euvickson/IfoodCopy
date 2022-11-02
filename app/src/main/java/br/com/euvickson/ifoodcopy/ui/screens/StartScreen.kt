package br.com.euvickson.ifoodcopy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.euvickson.ifoodcopy.ui.components.RestaurantList
import br.com.euvickson.ifoodcopy.ui.components.TabBar
import br.com.euvickson.ifoodcopy.ui.components.lists.CardList
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfIconsSample
import br.com.euvickson.ifoodcopy.ui.components.samples.profileLastRestaurantSample

@Composable
fun StartScreen() {
    Column {
        TabBar(tabBarIcons = listOfIconsSample)
        CardList()
        RestaurantList(profile = profileLastRestaurantSample)
    }
}

@Preview(showSystemUi = true)
@Composable
fun StartScreenPreview() {
    StartScreen()
}