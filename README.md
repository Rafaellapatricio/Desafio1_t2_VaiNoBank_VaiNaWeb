# Desafio1_t2_VaiNoBank_VaiNaWeb

Repositório destinado a desafio 1 da t2 em Java, do Vai na Web

# Desafio Java - Vai no banco

Bem-vindo ao Desafio Java - Vai No Bank - Este projeto consiste em seis classes principais: App, Conta, ContaCorrente, ContaPoupanca, DadosConta, Operacoes.

A Aplicação permite cadastrar, editar, excluir dois tipos de conta: a conta corrente e a conta pupança, como também realizar operações bancárias como Saque, Depósito, Tranferência entre contas, independente do tipo.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

**`DadosConta.java`**: Classe responsável por representar as informações dos titulares da Conta.
    
    -   Atributos: nome, agencia, numero, cpf
    -   Métodos: Construtores.
    
**`App.java`**: Ponto de entrada do programa.
    
    -   Contém a lógica principal para interação com o usuário.
    -   Métodos: exibirMenu, escolherConta, escolherSaque, escolherDeposito, escolherTransferencia, criarContaCC, criarContaCP, listarContas, localizarConta, editarConta, excluirConta, menuMetodosBancarios, metodosBancarios, realizarDeposito, realizarDepositoCP,realizarSaque, realizarSaqueCP, realizarTransferenciaCP, realizarTransferenciaEntreContas.
    
**`Conta.java`**:  Classe extendida da classe `DadosConta.java` com as informações dos titulares da Conta.

    -   Atributos: saldo, tipoConta.
    -   Métodos: Construtores.

**`ContaCorrente.java`**: Classe responsável por as informações dos titulares do tipo Conta Corrente.
    
    -   Atributos: List<Contas> listaContas.
    -   Métodos: Construtores, criarConta, localizarConta, listarContas, excluirConta.
    
**`App.java`**: Classe que modela as características de um animal de estimação.
    
    -   Atributos: Nome, espécie, idade, etc.
    -   Métodos: Construtores.

**`ContaPoupanca.java`**: Classe responsável por as informações dos titulares do tipo Conta Poupanca.
    
    -   Atributos: List<Contas> listaContas.
    -   Métodos: Construtores, criarConta, localizarConta, listarContas, excluirConta.

## Funcionalidades

1.  **Cadastro de Contas do tipo Poupança:**
    
    -   Utiliza a classe `ContaPoupanca` para criar e armazenar informações dos titulares.

2.  **Cadastro de Contas do tipo Corrente:**
    
    -   Utiliza a classe `ContaCorrente` para criar e armazenar informações dos titulares.
      
4.  **Consulta de Informações:**
    -   Utiliza as classes `ContaCorrente` e `ContaPoupanca`para visualizar as informações.
    -   Permite visualizar as informações dos titulares.
