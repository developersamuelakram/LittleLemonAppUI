package com.example.composeprac

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MenuCategory(category: String) {


    Button(onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.LightGray),
            shape = RoundedCornerShape(45),
            modifier = Modifier.padding(5.dp)
        ){

        Text(text = category, fontSize = 15.sp, color = Color.Black)

    }


}