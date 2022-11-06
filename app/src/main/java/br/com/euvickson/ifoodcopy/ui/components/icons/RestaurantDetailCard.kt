package br.com.euvickson.ifoodcopy.ui.components.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.euvickson.ifoodcopy.R
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Restaurant
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfRestaurantSample
import br.com.euvickson.ifoodcopy.ui.theme.Orange

@Composable
fun RestaurantDetailCard(restaurant: Restaurant) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        CardCreated(restaurant)
        Icon(
            painter = painterResource(id = R.drawable.icon_favorite_checked),
            contentDescription = "Ícone de favorito",
        )
    }
}

@Composable
private fun CardCreated(restaurant: Restaurant) {
    Row (modifier = Modifier
        .heightIn(75.dp, 100.dp),
        verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = restaurant.logo),
            contentDescription = "Logo do Restaurante",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = CircleShape)
                .height(75.dp)
                .width(75.dp)
        )

        Column (modifier = Modifier
            .padding(horizontal = 8.dp)
            .height(75.dp), verticalArrangement = Arrangement.SpaceAround) {
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(text = restaurant.name)
                if(restaurant.superRestaurant) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_super_restaurant),
                        contentDescription = "Super Restaurant Icon",
                        tint = Color.Red
                    )
                }
            }
            Row (verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_restaurant_rate),
                    contentDescription = "Estrela de avaliação",
                    tint = Orange
                )
                Text(text = "4,4", color = Orange)
                DotIcon()
                Text(text = restaurant.restaurantType, color = Color.DarkGray)
                DotIcon()
                Text(text = "2,8 km", color = Color.DarkGray)
            }
            Row (verticalAlignment = Alignment.CenterVertically) {
                Text(text = "34 - 50 min", color = Color.DarkGray)
                DotIcon()
                Text(text = "Grátis", color = Color.Green)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RestaurantDetailCardPreview() {
    RestaurantDetailCard(restaurant = listOfRestaurantSample[0])
}