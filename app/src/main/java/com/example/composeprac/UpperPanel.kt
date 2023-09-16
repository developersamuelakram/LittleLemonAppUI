package com.example.composeprac

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun UpperPanel(navController: NavHostController) {

    val context = LocalContext.current



    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF495E57))
            .padding(top = 30.dp)
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start=20.dp, top = 30.dp)

        )

        Text(
            text = "Chicago",
            modifier = Modifier.padding(start=20.dp),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Start) {

            Text(text= stringResource(id= R.string.description),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize= 23.sp)



            Image(painter = painterResource(id=R.drawable.littlelemon), contentDescription = null,
                Modifier
                    .fillMaxWidth(1F)
                    .height(200.dp)
                    .clip(RoundedCornerShape(30.dp)), contentScale = ContentScale.FillBounds)


        }


        Button(
            onClick = { navController.navigate(MenuList.route) },
            border = BorderStroke(1.dp, Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier= Modifier
                .padding(horizontal = 20.dp)
                .padding(bottom = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14))
        )
        {
            Text(text = "Order Take Away", color = Color.Black)
        }


    }



}

