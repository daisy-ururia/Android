package com.daisy.zawadimart.ui.screens.assignment

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.daisy.zawadimart.R
import com.daisy.zawadimart.navigation.ROUT_ABOUT
import com.daisy.zawadimart.navigation.ROUT_HOME
import com.daisy.zawadimart.navigation.ROUT_ITEM
import com.daisy.zawadimart.ui.theme.green1
import com.daisy.zawadimart.ui.theme.newOrange
import com.daisy.zawadimart.ui.theme.newblue
import com.daisy.zawadimart.ui.theme.newwhite

@Composable
fun AssignmentScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newwhite
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Star, contentDescription = "") },

                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },

                    selected = selectedIndex == 3,
                    onClick = { selectedIndex = 3
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .horizontalScroll(rememberScrollState())
            ) {
                val mContext = LocalContext.current


                //Main Contents of the page
                Row (modifier = Modifier.padding(20.dp)){
                    Text(
                        text = "Hi Samantha",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )




                    Spacer(modifier = Modifier.width(20.dp))

                    Column(modifier = Modifier.background(newOrange).height(50.dp).width(70.dp),


                    ) {
                        Image(
                            painter = painterResource(R.drawable.tr),
                            contentDescription = ""
                        )

                    }

                }
                //End of row
                Spacer(modifier = Modifier.height(20.dp))



                //Row2
                Row (modifier = Modifier
                    .padding(start = 20.dp)

                ) {
                    //Card1
                    Card(
                        modifier = Modifier.width(180.dp).height(250.dp),
                        colors = CardDefaults.cardColors(newblue)

                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.status),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(text = "Cryptocurrency Landing Page", fontSize = 15.sp)

                        }

                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))

                    //Card2
                    Card(
                        modifier = Modifier.width(180.dp).height(250.dp),
                        colors = CardDefaults.cardColors(newOrange)

                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.statistic),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(text = "Statistics Dashboard", fontSize = 15.sp)

                        }

                    }
                    //End of card2
                    //Card3
                    Card(
                        modifier = Modifier.width(180.dp).height(250.dp),
                        colors = CardDefaults.cardColors(newOrange)

                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.status),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                            Text(text = "Cryptocurrency Landing Page", fontSize = 15.sp)

                        }

                    }

                }
                //End of row
                Spacer(modifier = Modifier.height(40.dp))

                Column {
                    //Row1
                    Row (modifier = Modifier.padding(start = 20.dp)){
                        //Card1
                        Card (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)

                        ){
                            Column{
                                Image(
                                    painter = painterResource(R.drawable.video),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp),

                                    )
                                Text(text = "", fontSize = 15.sp)

                            }

                        }
                        //End of card1
                        Spacer(modifier = Modifier.width(20.dp))

                        //Card2
                        Card (
                            modifier = Modifier
                                .width(150.dp)
                                .height(180.dp)
                                .clickable{navController.navigate(ROUT_ABOUT)}
                        ){
                            Column(
                                modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.about),
                                    contentDescription = "about",
                                    modifier = Modifier.size(100.dp)
                                )
                                Text(text = "About", fontSize = 15.sp)

                            }

                        }
                        //End of card2

                    }

                    //End of row1

                }





            }
        }
    )

    //End of scaffold


}

@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview(){
    AssignmentScreen(rememberNavController())

}