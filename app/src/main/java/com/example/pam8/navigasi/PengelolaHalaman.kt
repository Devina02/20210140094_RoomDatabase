package com.example.pam8.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pam8.halaman.DestinasiEntry
import com.example.pam8.halaman.DestinasiHome
import com.example.pam8.halaman.EntrySiswaScreen
import com.example.pam8.halaman.HomeScreen

@Composable
fun SiswaApp(navController: NavController= rememberNavController()){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController=navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry.route)},
                )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = {navController.popBackStack()})
        }
    }
}
