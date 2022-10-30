package br.com.euvickson.ifoodcopy.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.euvickson.ifoodcopy.R
import br.com.euvickson.ifoodcopy.model.Profile
import br.com.euvickson.ifoodcopy.model.Restaurant
import br.com.euvickson.ifoodcopy.ui.components.CardIcon
import br.com.euvickson.ifoodcopy.ui.components.RestaurantList
import br.com.euvickson.ifoodcopy.ui.components.lists.CardList

@Composable
fun StartScreen() {
    Column {
        CardList()
        RestaurantList(
            profile = Profile(
                lastRestaurantList = listOf(
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    ),
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    ),
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    ),
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    ),
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    ),
                    Restaurant(
                        "Boa Pizza",
                        R.drawable.placeholder
                    )
                )
            )
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun StartScreenPreview() {
    StartScreen()
}