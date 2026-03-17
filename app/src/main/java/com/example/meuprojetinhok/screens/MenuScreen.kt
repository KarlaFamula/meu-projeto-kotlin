package com.example.meuprojetinhok.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Menu")

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("perfil/Karla/25")
        }) {
            Text("Perfil")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate("pedidos?cliente=Cliente XPTO")
        }) {
            Text("Pedidos")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navController.navigate("login")
        }) {
            Text("Sair")
        }
    }
}