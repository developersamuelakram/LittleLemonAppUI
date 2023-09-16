package com.example.composeprac

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController,) {



    val Categories = listOf<String>(
        "Lunch",
        "Dessert",
        "Mains"
    )


    var isDrawerOpen by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    Scaffold(

        topBar = {
            TopAppBar(
                onMenuClick = { isDrawerOpen = true }
            )
        },
    ) {
        Column {
            UpperPanel(navController)

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Categories.forEach {
                    MenuCategory(category = it)
                }
            }

            MenuGrid()

            //LowerPanel()
        }
    }

    if (isDrawerOpen) {
        DrawerPanel(
            onLogoutClick = {
                isDrawerOpen = false
            }
        )
    }

    LaunchedEffect(isDrawerOpen) {
        if (!isDrawerOpen) {
            coroutineScope.launch {
                // Delay to allow the drawer to close before executing other actions
                delay(300)
                // Add your actions after the drawer is closed here
            }
        }
    }






}
