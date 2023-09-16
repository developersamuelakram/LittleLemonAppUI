package com.example.composeprac

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import org.w3c.dom.Text

interface Destinations {
    val route: String
    val icon: ImageVector
    val title: String

}

object Home: Destinations{
    override val route = "HomeScreen"
    override val icon = Icons.Filled.Home
    override  val title = "Home"




}

object Settings: Destinations{
    override val route = "SettingsScreen"
    override val icon = Icons.Filled.Settings
    override val title = "Settings"
}


object MenuList: Destinations{
    override val route = "MenuList"
    override val icon: ImageVector
        get() = TODO("Not yet implemented")
    override val title: String
        get() = TODO("Not yet implemented")

}

// this object word is used to avoid using a class
// annonmus
object Dashboard: Destinations{
    override val route = "Dashboard"
    override val icon: ImageVector
        get() = TODO("Not yet implemented")
    override val title: String
        get() = TODO("Not yet implemented")

}

object Details: Destinations{
    override val route = "Details"
    override val icon: ImageVector
        get() = TODO("Not yet implemented")
    override val title: String
        get() = TODO("Not yet implemented")

}