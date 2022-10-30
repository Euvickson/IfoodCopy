package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.R

@Composable
fun CardIcon() {
    Image(
        painter = painterResource(id = R.drawable.delivery_gratis),
        contentDescription = "Imagem do Restaurante",
        Modifier
            .height(170.dp)
            .width(400.dp)
            .padding(8.dp)
            .clip(shape = RoundedCornerShape(15)),
        contentScale = ContentScale.FillWidth
    )
}

@Preview
@Composable
fun CardIconPreview() {
    CardIcon()
}