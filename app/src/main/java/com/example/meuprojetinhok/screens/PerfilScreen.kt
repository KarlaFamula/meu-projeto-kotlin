package com.example.meuprojetinhok.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Tela de Perfil — recebe nome e idade como parâmetros OBRIGATÓRIOS na URL
// Formato da rota: perfil/{nome}/{idade}
@Composable
fun PerfilScreen(modifier: Modifier = Modifier, navController: NavController, nome: String, idade: Int) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4CAF50))  // cor de fundo verde da tela de perfil
            .padding(32.dp)
    ) {

        // Título "PERFIL" exibido no canto superior esquerdo
        Text(
            text = "PERFIL",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Column centralizada exibindo nome e idade do usuário
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = "Nome: $nome",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Idade: $idade anos",
                fontSize = 18.sp,
                color = Color.White
            )
        }

        // Botão "Voltar" — retorna para a tela de Menu
        Button(
            onClick = { navController.navigate("menu") },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text(
                text = "Voltar",
                fontSize = 20.sp,
                color = Color.Blue
            )
        }
    }
}

