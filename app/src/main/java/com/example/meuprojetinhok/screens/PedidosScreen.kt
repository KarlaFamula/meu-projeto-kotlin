package com.example.meuprojetinhok.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Tela de Pedidos — recebe o nome do cliente como parâmetro OPCIONAL (query string)
// O parâmetro "cliente" é nullable (String) pois pode não ser enviado na navegação
// Se não for enviado, o valor padrão "Cliente Genérico" é aplicado no NavHost (MainActivity)
@Composable
fun PedidosScreen(modifier: Modifier = Modifier, navController: NavController, cliente: String?) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFA9A9A))
            .padding(32.dp)
    ) {


        // O operador "$" faz a interpolação diretamente no texto do Composable
        Text(
            text = "PEDIDOS - $cliente",   // ex: "PEDIDOS - Cliente XPTO"
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )


        Button(
            onClick = { navController.navigate("menu") }, // navega de volta para o menu
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


