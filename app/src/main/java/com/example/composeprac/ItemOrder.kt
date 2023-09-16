package com.example.composeprac

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults.Elevation
import androidx.compose.material3.NavigationBarDefaults.Elevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeprac.ui.theme.ComposePracTheme

@SuppressLint("InvalidColorHexValue")
@Composable
fun ItemOrder(count: Int, onIncrement:()-> Unit, onDecrement:()-> Unit,) {

    val context = LocalContext.current




    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.run {
            fillMaxSize()
                .padding(bottom = 7.dp)
                .background(Color(0xFFFFFF))
        }){

        Card(modifier =
        Modifier.padding(10.dp),
        ) {


            Text(
                modifier = Modifier.padding(4.dp),
                text = "Greek Salad",
                fontSize = 30.sp,
                fontWeight = FontWeight.W700
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {

                IconButton(onClick = {

                    onDecrement()


                }) {
                    Icon(imageVector = Icons.Default.Delete, contentDescription = null)

                }
                Text(text = "$count", fontSize = 20.sp, fontWeight = FontWeight.W300)
                IconButton(onClick = { onIncrement()}) {

                    Icon(imageVector = Icons.Default.Add, contentDescription = null)


                }


            }

            Button(onClick= {}, Modifier.fillMaxWidth().padding(10.dp)){

                Text(text = "Add")
            }

        }

    }



}
