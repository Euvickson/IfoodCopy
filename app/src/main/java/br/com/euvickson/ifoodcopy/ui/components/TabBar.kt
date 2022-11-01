package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Icon

@Composable
fun TabBar(tabBarIcons: List<Icon>) {
    var tabIndex by remember { mutableStateOf(0) }

    ScrollableTabRow(selectedTabIndex = tabIndex, backgroundColor = Color.White, contentColor = Color.Black, edgePadding = 0.dp, modifier = Modifier.fillMaxWidth()) {
        tabBarIcons.forEachIndexed { index, icon ->
            Tab(selected = tabIndex == index,onClick = {
                tabIndex = index
            }, text = {
                Text(text = icon.name)
            })
        }
    }
}