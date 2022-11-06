package br.com.euvickson.ifoodcopy.ui.components.icons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
    Row {
        Image(
            painter = painterResource(id = restaurant.logo),
            contentDescription = "Logo do Restaurante",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape = CircleShape)
                .height(75.dp)
                .width(75.dp)
        )
        
        Column (modifier = Modifier.padding(horizontal = 8.dp)) {
            Row {
                Text(text = restaurant.name)
                if(restaurant.superRestaurant) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_super_restaurant),
                        contentDescription = "Super Restaurant Icon",
                        tint = Color.Red
                    )
                }
            }
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.icon_restaurant_rate),
                    contentDescription = "Estrela de avaliação",
                    tint = Orange
                )
                Text(text = "4,4", color = Orange)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantDetailCardPreview() {
    RestaurantDetailCard(restaurant = listOfRestaurantSample[0])
}