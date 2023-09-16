package com.example.composeprac

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyNavigation() {

    val navController = rememberNavController()

    Scaffold(bottomBar = { MyBottomNavigation(navController = navController) }) {
        Box(Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = Home.route) {


            composable(Home.route) {
                HomeScreen(navController)
            }

            composable(Settings.route) {
                SettingsScreen(navController)
            }

            composable(Dashboard.route) {
                DashboardScreen(navController)
            }

            composable(Details.route) {
                DetailsScreen(navController)
            }

            composable(MenuList.route) {

                MenuListScreen(navController)
            }
        }

    }
}}