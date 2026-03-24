package com.example.meuprojetinhok.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// @Composable indica que esta função é uma tela/componente do Jetpack Compose
// modifier: permite que o chamador ajuste o layout externamente (padding, tamanho, etc.)
// navController: responsável por navegar entre as telas do app
@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {

    // Box é um contêiner que empilha elementos — os filhos podem ser posicionados com Alignment
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFED145B))
            .padding(32.dp)
    ) {

        // Texto "LOGIN" exibido no canto superior esquerdo (posição padrão do Box)
        Text(
            text = "LOGIN",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Botão centralizado na tela que leva o usuário para a tela de Menu
        Button(
            onClick = { navController.navigate("menu") }, // navega para a rota "menu" ao clicar
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = "ENTRAR",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}
