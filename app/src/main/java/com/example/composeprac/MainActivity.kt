package com.example.composeprac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.composeprac.ui.theme.ComposePracTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracTheme {
                //UpperPanel()


               MyNavigation()


            }
        }
    }


//    @Composable
//    fun AppOrder(){
//
//        var count by rememberSaveable(){
//            mutableStateOf(0)
//        }
//
//        ItemOrder(count, { count++ }) {
//            if (count > 0) {
//                count--
//            }
//        }
//
//
//    }
}

