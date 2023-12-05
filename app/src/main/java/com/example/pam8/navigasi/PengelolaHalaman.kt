package com.example.pam8.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navController: NavController= rememberNavController()){
    HostNavigasi(navController = navController)
}

@Composable
fun HostNavigasi(
    navController: NavController,
    modifier: Modifier = Modifier) {

}
