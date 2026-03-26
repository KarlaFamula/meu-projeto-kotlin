package com.example.meuprojetinhok.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// Tela de Perfil — recebe nome e idade como parâmetros OBRIGATÓRIOS na URL
// Formato da rota: perfil/{nome}/{idade}
@Composable
fun PerfilScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    nome: String,
    idade: Int
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF329F6B))  // cor de fundo verde da tela de perfil
            .padding(32.dp)
    ) {

        // Título exibido no canto superior esquerdo com nome e idade do usuário
        Text(
            text = "PERFIL - $nome tem $idade anos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Botão "Voltar" — retorna para a tela de Menu
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}
