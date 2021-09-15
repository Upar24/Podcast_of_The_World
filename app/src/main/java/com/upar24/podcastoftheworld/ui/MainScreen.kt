package com.upar24.podcastoftheworld.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.upar24.podcastoftheworld.Screen

@Composable
fun MainScreen(){
    Card(modifier=Modifier.fillMaxSize(),backgroundColor = MaterialTheme.colors.background){
        val navController:NavHostController= rememberNavController()
        Scaffold(
            topBar= { TopNavigation() }
        ){
            MainScreenNavigationConfiguration(navController)
        }
    }
}
@Composable
fun MainScreenNavigationConfiguration(navController: NavHostController){
    NavHost(navController,startDestination = Screen.MainScreen.route){

    }
}
@Composable
fun TopNavigation(){

}