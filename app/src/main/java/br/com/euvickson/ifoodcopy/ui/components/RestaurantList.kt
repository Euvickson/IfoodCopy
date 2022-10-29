package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Profile
import br.com.euvickson.ifoodcopy.model.Restaurant
import br.com.euvickson.ifoodcopy.R

@Composable
fun RestaurantList(profile: Profile) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        profile.lastRestaurantList?.let { restaurantList ->
            items(restaurantList) { restaurant ->
                RestaurantIcon(restaurant = restaurant)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListPreview() {
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