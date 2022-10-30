package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import br.com.euvickson.ifoodcopy.model.Icon

@Composable
fun SuggestionIcons(icon: Icon) {
    Column(
        Modifier
            .width(100.dp)
            .heightIn(max = 150.dp)
    ) {
        Image(
            painter = painterResource(id = icon.iconImage),
            contentDescription = "Imagem de sugestão do que pedir no app",
            Modifier
                .height(100.dp)
                .width(100.dp)
                .clip(shape = RoundedCornerShape(20))
                .align(Alignment.CenterHorizontally),
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = icon.name,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SuggestionIconsPreview() {
    SuggestionIcons(icon = Icon(name = "Restaurantes", iconImage = R.drawable.placeholder))
}