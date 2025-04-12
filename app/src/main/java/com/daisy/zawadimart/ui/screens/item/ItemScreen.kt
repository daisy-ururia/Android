package com.daisy.zawadimart.ui.screens.item

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.daisy.zawadimart.R
import com.daisy.zawadimart.navigation.ROUT_INTENT
import com.daisy.zawadimart.ui.theme.newOrange
import com.daisy.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newOrange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }

            }
        )
        //End

        Image(
            painter = painterResource(R.drawable.heel),
            contentDescription = "heel",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))
        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search") }
        )
        //End of Searchbar
        Spacer(modifier = Modifier.height(10.dp))



        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Row
            Row (modifier = Modifier.padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.shoe),
                    contentDescription = "dress",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Men's shoes",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.5500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price : Ksh.4500",
                        fontSize = 15.sp,
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(
                        onClick ={
                            val callIntent=Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0718154510".toUri()
                            mContext.startActivity(callIntent)
                        },
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Text(text = "Contact Us")
                    }


                }
            }
            //End of row

            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier.padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.bshoe),
                    contentDescription = "babyshoe",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Baby shoes",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.800",
                        fontSize = 15.sp,textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price : Ksh.650",
                        fontSize = 15.sp,
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(
                        onClick ={},
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Text(text = "Contact Us")
                    }


                }
            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.women),
                    contentDescription = "women shoes",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Women shoes",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.2000",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price : Ksh.1500",
                        fontSize = 15.sp,
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(
                        onClick ={},
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Text(text = "Contact Us")
                    }


                }
            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.sneaker),
                    contentDescription = "sneaker",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Trainer Sneakers",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.3500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price : Ksh 2800",
                        fontSize = 15.sp,
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(
                        onClick ={},
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Text(text = "Contact Us")
                    }


                }
            }
            //End of row
            Spacer(modifier = Modifier.height(10.dp))

            //Row
            Row (modifier = Modifier.padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.jordan),
                    contentDescription = "jordan",
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Air Jordan14",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.2800",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price : Ksh.2000",
                        fontSize = 15.sp,
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(
                        onClick ={},
                        colors = ButtonDefaults.buttonColors(newOrange),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Text(text = "Contact Us")
                    }


                }
            }
            //End of row



        }


    }

}



@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())

}