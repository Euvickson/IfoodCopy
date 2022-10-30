package br.com.euvickson.ifoodcopy.ui.components.lists

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.euvickson.ifoodcopy.ui.components.CardIcon

@Composable
fun CardList() {
    LazyRow {
        this.items(7) {
            CardIcon()
        }
    }
}

@Preview
@Composable
fun CardListPreview() {
    CardList()
}