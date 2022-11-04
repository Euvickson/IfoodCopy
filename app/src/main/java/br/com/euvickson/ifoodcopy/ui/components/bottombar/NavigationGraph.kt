package br.com.euvickson.ifoodcopy.ui.components.bottombar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.euvickson.ifoodcopy.ui.screens.OrdersScreen
import br.com.euvickson.ifoodcopy.ui.screens.ProfileScreen
import br.com.euvickson.ifoodcopy.ui.screens.SearchScreen
import br.com.euvickson.ifoodcopy.ui.screens.StartScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Home.screenRoute) {
        composable(BottomNavItem.Home.screenRoute){
            StartScreen()
        }
        composable(BottomNavItem.Search.screenRoute){
            SearchScreen()
        }
        composable(BottomNavItem.Orders.screenRoute){
            OrdersScreen()
        }
        composable(BottomNavItem.Profile.screenRoute){
            ProfileScreen()
        }
    }
}