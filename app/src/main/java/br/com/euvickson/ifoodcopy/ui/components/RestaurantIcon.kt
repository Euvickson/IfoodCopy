package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.euvickson.ifoodcopy.R
import br.com.euvickson.ifoodcopy.model.Restaurant
import br.com.euvickson.ifoodcopy.ui.theme.IfoodCopyTheme

@Composable
fun RestaurantIcon(restaurant: Restaurant) {
    Column(
        Modifier
            .width(100.dp)
            .heightIn(max = 150.dp)
    ) {
        Image(
            painter = painterResource(id = restaurant.logo),
            contentDescription = "Imagem do Restaurante",
            Modifier
                .height(100.dp)
                .width(100.dp)
                .clip(shape = CircleShape)
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = restaurant.nome,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RestaurantIconPreview() {
    IfoodCopyTheme {
        RestaurantIcon(restaurant = Restaurant("Boa Pizza", R.drawable.placeholder))
    }
}