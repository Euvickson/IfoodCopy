package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Profile
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfProfileSample

@Composable
fun RestaurantList(profile: Profile) {

    Column (verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Últimas Lojas")
            Text(text = "Ver mais", color = Color.Red)
        }

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
}

@Preview(showBackground = true)
@Composable
fun RestaurantListPreview() {
    RestaurantList(listOfProfileSample)

}