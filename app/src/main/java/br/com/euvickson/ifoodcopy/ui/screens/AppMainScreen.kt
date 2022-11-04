package br.com.euvickson.ifoodcopy.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import br.com.euvickson.ifoodcopy.ui.components.bottombar.BottomNavigation
import br.com.euvickson.ifoodcopy.ui.components.bottombar.NavigationGraph

@Composable
fun AppMainScreen() {
    val navController = rememberNavController()
    Scaffold (
        bottomBar = { BottomNavigation(navController = navController)}
            ) {
        NavigationGraph(navController = navController)
    }
}