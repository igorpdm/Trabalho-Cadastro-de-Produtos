# Cadastro de Produtos

Este é um programa de cadastro de produtos que permite inserir, alterar, excluir e listar produtos. O programa foi desenvolvido em Java e pode ser utilizado para gerenciar um inventário de produtos.

## Funcionalidades

O programa oferece as seguintes funcionalidades:

1. Inserir produtos: Permite inserir novos produtos no sistema.
2. Alterar produtos: Permite alterar as informações de um produto existente.
3. Excluir produtos: Permite excluir um produto do sistema.
4. Gerar listagem dos produtos: Oferece opções para listar todos os produtos, listar os produtos em ordem alfabética pelo nome ou buscar um produto específico.

## Como usar

1. Clone este repositório ou faça o download dos arquivos.
2. Certifique-se de ter o ambiente Java configurado em sua máquina.
3. Abra o arquivo `Programa.java` em seu editor de código Java preferido.
4. Compile e execute o programa.

Ao executar o programa, você será apresentado a um menu com as opções disponíveis. Basta selecionar a opção desejada digitando o número correspondente.

## Observações

- O programa utiliza um vetor de tamanho fixo para armazenar os produtos. O vetor tem capacidade para até 10 produtos, mas você pode ajustar esse valor conforme suas necessidades.
- Os produtos são representados pela classe `Produto`, que possui os seguintes atributos: `codigo`, `nome`, `marca`, `preco` e `quantidade`.
- O programa faz uso de entrada de dados via teclado utilizando a classe `Scanner`.
- Ao iniciar o programa, serão inseridos automaticamente 5 produtos iniciais para demonstração. Você pode remover essa inicialização automática no método `init` se desejar.
