package com.daisy.zawadimart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.daisy.zawadimart.ui.screens.about.AboutScreen
import com.daisy.zawadimart.ui.screens.dashboard.DashboardScreen
import com.daisy.zawadimart.ui.screens.form.FormScreen
import com.daisy.zawadimart.ui.screens.home.HomeScreen
import com.daisy.zawadimart.ui.screens.intent.IntentScreen
import com.daisy.zawadimart.ui.screens.item.ItemScreen
import com.daisy.zawadimart.ui.screens.service.ServiceScreen
import com.daisy.zawadimart.ui.screens.splash.SplashScreen
import com.daisy.zawadimart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }

    }
}