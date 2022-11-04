package br.com.euvickson.ifoodcopy.ui.components.bottombar

import br.com.euvickson.ifoodcopy.R

sealed class BottomNavItem (val title: String, val icon: Int, val screenRoute: String) {

    object Home: BottomNavItem("Home", R.drawable.icon_home, "home")
    object Search: BottomNavItem("Search", R.drawable.icon_search, "search")
    object Orders: BottomNavItem("Orders", R.drawable.icon_old_orders, "orders")
    object Profile: BottomNavItem("Profile", R.drawable.icon_profile, "profile")
}