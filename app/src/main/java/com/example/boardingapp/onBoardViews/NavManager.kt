package com.example.boardingapp.onBoardViews

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "onBoarding") {
        composable(route = "onBoarding") {
            MainOnBoarding(navController)
        }
        composable(route = "home") {
            HomeView(navController)
        }
    }
}
