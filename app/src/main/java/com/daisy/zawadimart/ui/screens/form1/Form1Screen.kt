package com.daisy.zawadimart.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.daisy.zawadimart.R
import com.daisy.zawadimart.ui.theme.deepblue
import com.daisy.zawadimart.ui.theme.newOrange
import com.daisy.zawadimart.ui.theme.newwhite

@Composable
fun LoginScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(newwhite)


    ){
        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(400.dp),
            shape = RoundedCornerShape(bottomStart =60.dp , bottomEnd = 60.dp),
            colors = CardDefaults.cardColors(deepblue)
        ) {
            Row (Modifier.padding(horizontal = 60.dp, vertical = 10.dp)){
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = ""
                )

                Text(
                    text = "Logo App",
                    fontSize = 35.sp,
                    color = newwhite,
                    textAlign = TextAlign.Center

                )
            }
            Image(
                painter = painterResource(R.drawable.basket),
                contentDescription = "",
                modifier = Modifier.size(350.dp).padding(20.dp),


                )



        }
        //End of card
        //Card
        Card(
            modifier = Modifier.fillMaxWidth().height(400.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
            colors = CardDefaults.cardColors(newwhite)
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ){
                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "The Most Worthy Grocery App",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = newOrange,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(10.dp))

                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                //Username
                TextField(
                    value = username,
                    onValueChange = { username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                    label = {Text(text = "Username")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    shape = RoundedCornerShape(20.dp),


                    )
                //End
                Spacer(modifier = Modifier.height(20.dp))

                //Password
                TextField(
                    value = password,
                    onValueChange = { password = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp,end = 20.dp),
                    label = {Text(text = "Password")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    shape = RoundedCornerShape(20.dp),

                    )
                //End
                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick ={},
                    colors = ButtonDefaults.buttonColors(newOrange),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.width(500.dp).height(50.dp).padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(text = "Sign Up")
                }



            }



        }
        //End of card

    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}