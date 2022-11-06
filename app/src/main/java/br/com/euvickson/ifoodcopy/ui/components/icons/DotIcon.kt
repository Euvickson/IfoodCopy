package br.com.euvickson.ifoodcopy.ui.components.icons

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.R

@Composable
fun DotIcon() {
    Icon(
        painter = painterResource(id = R.drawable.icon_dot),
        contentDescription = "Ponto que separa especificações do restaurante",
        tint = Color.DarkGray,
        modifier = Modifier.padding(horizontal = 5.dp)
    )
}