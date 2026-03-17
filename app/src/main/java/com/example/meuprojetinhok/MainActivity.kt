package com.example.meuprojetinhok

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.meuprojetinhok.screens.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()

            Scaffold { innerPadding ->

                NavHost(
                    navController = navController,
                    startDestination = "login",
                    modifier = Modifier.padding(innerPadding)
                ) {

                    composable("login") {
                        LoginScreen(navController)
                    }

                    composable("menu") {
                        MenuScreen(navController)
                    }

                    composable("perfil/{nome}/{idade}") { backStackEntry ->

                        val nome = backStackEntry.arguments
                            ?.getString("nome") ?: "Usuário"

                        val idade = backStackEntry.arguments
                            ?.getString("idade")
                            ?.toIntOrNull() ?: 0

                        PerfilScreen(navController, nome, idade)
                    }

                    composable("pedidos?cliente={cliente}") { backStackEntry ->

                        val cliente = backStackEntry.arguments
                            ?.getString("cliente") ?: "Cliente"

                        PedidosScreen(navController, cliente)
                    }

                }
            }
        }
    }
}