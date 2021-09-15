package com.upar24.podcastoftheworld

sealed class Screen(val route:String){
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")
    object SearchScreen : Screen("search_screen")
}
