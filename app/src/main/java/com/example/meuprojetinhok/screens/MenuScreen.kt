package com.example.meuprojetinhok.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Tela de Menu — ponto central de navegação do app após o login
// Oferece três opções: ir para Perfil, ir para Pedidos ou voltar para o Login (Sair)
@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {

    // Box como contêiner principal com fundo azul escuro
    Box(
        modifier = modifier
            .fillMaxSize()                  // ocupa toda a tela
            .background(Color(0xFF2C4EC7))  // cor de fundo azul da tela de menu
            .padding(32.dp)                 // espaçamento interno
    ) {

        // Título "MENU" exibido no canto superior esquerdo
        Text(
            text = "MENU",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        // Column organiza os botões verticalmente, centralizados na tela
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // centraliza os filhos na horizontal
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        ) {

            // Botão "Perfil" — navega passando parâmetros OBRIGATÓRIOS na URL
            // Formato: perfil/{nome}/{idade} — nome e idade são embutidos diretamente na rota
            Button(
                onClick = { navController.navigate("perfil/Fulano de Tal/27") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.size(width = 200.dp, height = 48.dp) // tamanho fixo do botão
            ) {
                Text(text = "Perfil", fontSize = 20.sp, color = Color.Blue)
            }


            Spacer(modifier = Modifier.height(16.dp))



            Button(
                onClick = { navController.navigate("pedidos?cliente=Cliente XPTO") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Pedidos", fontSize = 20.sp, color = Color.Blue)
            }

            Spacer(modifier = Modifier.height(16.dp))


            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier.size(width = 200.dp, height = 48.dp)
            ) {
                Text(text = "Sair", fontSize = 20.sp, color = Color.Blue)
            }
        }
    }
}
