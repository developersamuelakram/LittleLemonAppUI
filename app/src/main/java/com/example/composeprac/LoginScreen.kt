package com.example.composeprac

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeprac.ui.theme.ComposePracTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){

    val userName : String = "Samuel"
    val password : String = "littlelemon"

    val context = LocalContext.current



    var enteredUser by rememberSaveable {
        mutableStateOf("")
    }
    var enteredPassword by rememberSaveable {
        mutableStateOf("")
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Image(
            painter = painterResource(R.drawable.littlelemonlogo), contentDescription = null
        )



        Column(modifier = Modifier.padding(7.dp)) {

        }

        OutlinedTextField(value = enteredUser, onValueChange = {enteredUser = it},
            placeholder = { Text("Enter UserName") })


        Column(modifier = Modifier.padding(5.dp)) {

        }

        OutlinedTextField(value = enteredPassword, onValueChange = {enteredPassword = it},
            placeholder = { Text("Enter Password") })

        Row {
            Button(
                onClick = {

                          if (enteredUser == userName && enteredPassword == password){

                              Toast.makeText(context, "Valid Credentials", Toast.LENGTH_SHORT).show()
                          } else {

                              Toast.makeText(context, "Invalid Credentials", Toast.LENGTH_SHORT).show()


                          }

                },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = buttonColors(containerColor = Color(0xFFF4CE14))
            )
            {
                Text(text = "Login")
            }


        }


    }



}
