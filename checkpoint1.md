# 📱 Documentação - Navegação com Parâmetros (Checkpoint 1)

---

## 📌 1. Introdução

Este projeto tem como objetivo implementar a navegação entre telas utilizando **parâmetros obrigatórios e opcionais** em um aplicativo Android com **Kotlin**.

A navegação foi desenvolvida com foco em boas práticas, permitindo a troca de informações entre diferentes telas de forma estruturada.

---

## 👤 2. Parâmetro Obrigatório (Tela de Perfil)

Foi implementada uma navegação para a tela de **Perfil** utilizando um parâmetro obrigatório (`nome`).

Esse parâmetro é essencial para o funcionamento da tela e deve ser obrigatoriamente informado no momento da navegação.

### ⚙️ Funcionamento

- O parâmetro é definido na rota como `{nome}`
- Ao navegar, é necessário enviar um valor
- O valor é recuperado na tela de destino usando `backStackEntry.arguments`

---

## 🛒 3. Parâmetro Opcional (Tela de Pedidos)

Na tela de **Pedidos**, foi implementado um parâmetro opcional chamado `filtro`.

Esse tipo de parâmetro permite que a navegação funcione mesmo quando nenhum valor é enviado.

### ⚙️ Funcionamento

- O parâmetro é definido com um valor padrão
- Caso nenhum valor seja enviado, o sistema utiliza o valor padrão
- Caso um valor seja enviado, ele substitui o padrão

---

## 🎯 4. Inserção de Valor em Parâmetro Opcional

Foi demonstrado como enviar valores personalizados para parâmetros opcionais.

Isso permite maior flexibilidade na navegação, como por exemplo aplicar filtros diferentes na tela de pedidos.

---

## 🔗 5. Múltiplos Parâmetros

Também foi implementada a passagem de múltiplos parâmetros entre telas, como `nome` e `idade`.

Essa abordagem permite enviar mais de uma informação ao mesmo tempo.

### ⚙️ Funcionamento

- Os parâmetros são definidos na rota em sequência
- A ordem dos parâmetros deve ser respeitada
- Cada valor é recuperado individualmente na tela de destino

---

## ✅ 6. Conclusão

A implementação demonstrou como utilizar diferentes tipos de parâmetros na navegação entre telas em Kotlin.

Com isso, é possível criar aplicações mais **dinâmicas**, **reutilizáveis** e **organizadas**.

---

## 🚀 Tecnologias Utilizadas

- Kotlin
- Android Studio
- Jetpack Navigation

---

## 💡 Autor

Desenvolvido por **Karla Famula**