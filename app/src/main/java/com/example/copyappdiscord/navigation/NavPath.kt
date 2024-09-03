package com.example.copyappdiscord.navigation

sealed class NavPath(val route: String) {
    data object Start : NavPath("start")
    data object Main : NavPath("main")
}