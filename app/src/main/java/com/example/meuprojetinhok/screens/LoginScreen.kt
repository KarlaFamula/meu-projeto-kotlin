package com.example.meuprojetinhok.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Tela de Login")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate("menu")
            }
        ) {
            Text("ENTRAR")
        }
    }
}