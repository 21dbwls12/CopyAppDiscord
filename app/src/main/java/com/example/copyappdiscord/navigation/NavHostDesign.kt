package com.example.copyappdiscord.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.copyappdiscord.screen.MainScreen
import com.example.copyappdiscord.screen.SignUpScreen
import com.example.copyappdiscord.screen.StartScreen

@Composable
fun NavHostDesign(startDestination: String = NavPath.Start.route) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        composable(startDestination) { StartScreen(navController) }
        composable(NavPath.Main.route) { MainScreen(navController) }
        composable(
            NavPath.SignUp.route,
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Start
                )
            },
            exitTransition = { slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.End) }
        ) { SignUpScreen(navController) }
    }
}