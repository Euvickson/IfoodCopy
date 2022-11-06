package br.com.euvickson.ifoodcopy.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.euvickson.ifoodcopy.model.Icon
import br.com.euvickson.ifoodcopy.ui.components.samples.listOfIconsSample

@Composable
fun TabBar(tabBarIcons: List<Icon>) {
    var tabIndex by remember { mutableStateOf(0) }


    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .clickable {}
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Rua Tal")
            Icon(Icons.Sharp.ArrowDropDown, contentDescription = null)
        }

        ScrollableTabRow(
            selectedTabIndex = tabIndex,
            backgroundColor = Color.White,
            contentColor = Color.Red,
            edgePadding = 0.dp,
            modifier = Modifier.fillMaxWidth(),
            indicator = {
                TabRowDefaults.Indicator(Modifier.tabIndicatorOffset(it[tabIndex]))
            }) {
            tabBarIcons.forEachIndexed { index, icon ->
                Tab(
                    selected = tabIndex == index,
                    onClick = {
                        tabIndex = index
                    },
                    text = {
                        Text(text = icon.name)
                    },
                    unselectedContentColor = Color.Black
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TabBarPreview() {
    TabBar(tabBarIcons = listOfIconsSample)
}