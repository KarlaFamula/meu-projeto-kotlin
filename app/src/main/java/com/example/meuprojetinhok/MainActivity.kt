package com.example.meuprojetinhok

// MainActivity é o ponto de entrada do app — a primeira Activity que o Android abre
class MainActivity : ComponentActivity() {

    // onCreate() é chamado quando a Activity é criada pela primeira vez
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite que o conteúdo se estenda até as bordas da tela (status bar, navigation bar)
        enableEdgeToEdge()

        setContent {


            CP01_KotlinTheme {

                // Scaffold fornece a estrutura básica de layout do Material Design
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // rememberNavController cria e lembra o controlador de navegação
                    // É ele que gerencia para qual tela o app deve ir
                    val navController = rememberNavController()

                    // NavHost é o container que exibe as telas com base na rota atual
                    // startDestination define qual tela aparece primeiro (tela de login)
                    NavHost(
                        navController = navController,
                        startDestination = "login",
                    ) {

                        // Define a rota "login" — quando navegar para "login", abre LoginScreen
                        composable(route = "login") {
                            LoginScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        // Define a rota "menu" — quando navegar para "menu", abre MenuScreen
                        composable(route = "menu") {
                            MenuScreen(modifier = Modifier.padding(innerPadding), navController)
                        }

                        // Rota "pedidos" com parâmetro OPCIONAL via query string (?cliente=...)
                        composable(
                            route = "pedidos?cliente={cliente}",
                            arguments = listOf(navArgument("cliente") {
                                defaultValue = "Cliente Genérico" // valor padrão se não for passado
                            })
                        ) {
                            PedidosScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                it.arguments?.getString("cliente") // recupera o argumento da rota
                            )
                        }

                        // Rota "perfil" com parâmetros OBRIGATÓRIOS na URL (/{nome}/{idade})
                        // Os tipos são declarados explicitamente: String para nome, Int para idade
                        composable(
                            route = "perfil/{nome}/{idade}",
                            arguments = listOf(
                                navArgument("nome") { type = NavType.StringType },
                                navArgument("idade") { type = NavType.IntType }
                            )
                        ) {
                            // Recupera os valores passados pela rota com fallback caso sejam nulos
                            val nome: String? = it.arguments?.getString("nome", "Usuário Genérico")
                            val idade: Int? = it.arguments?.getInt("idade", 0)

                            PerfilScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController,
                                nome!!,
                                idade!!
                            )
                        }
                    }
                }
            }
        }
    }
}
