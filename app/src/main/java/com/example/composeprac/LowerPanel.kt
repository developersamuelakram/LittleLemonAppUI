package com.example.composeprac

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeprac.ui.theme.ComposePracTheme

@Composable
fun LowerPanel(){

    Column(modifier = Modifier.fillMaxWidth()){

        Text(text = "Weekly Special",
            fontSize= 22.sp, fontWeight= FontWeight.Bold,
            modifier = Modifier.padding(10.dp))

        Text(text = "Greek Salad",
            fontSize= 18.sp, fontWeight= FontWeight.Bold
            ,
            modifier = Modifier.padding(10.dp))




        Row( horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth() ){


            Text(text = stringResource(id = R.string.greek),
                fontSize= 15.sp, fontWeight= FontWeight.Light,
                modifier = Modifier.width(200.dp))



            Image(painter = painterResource(R.drawable.greeksalad),
                contentDescription= null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.width(120.dp).height(100.dp).clip(RoundedCornerShape(20.dp)))


        }


        Text(text = "$2 USD",
            fontSize= 15.sp, fontWeight= FontWeight.Light,
            modifier = Modifier.width(200.dp).padding(10.dp))






    }



}

