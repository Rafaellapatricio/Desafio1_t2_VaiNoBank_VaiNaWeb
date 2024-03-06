package br.com.vainaweb.vainubank;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String [] args) {
    	
    	ContaCorrente cc = new ContaCorrente();
    	ContaPoupanca cp= new ContaPoupanca();
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("\n- VAI NO BANCO - ");
      
        boolean menuAtivo = true;

        while (menuAtivo) {
        	
        	exibirMenu();

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
				// colocar o identificador de tipo de conta 
                	escolherConta(sc, cc, cp); 
                    break;
                case 2:
                	listarContas(cc, cp);
                    break;
                case 3:
                	localizarConta(sc,cc);
                    break;
                case 4:
                	editarConta(sc,cc,cp);
                    break;
                case 5:
                	excluirConta(sc,cc,cp);
                    break;
                case 6:
                	metodosBancarios(sc,cc,cp);
                    break;
                case 0:
                    System.out.println("\n> Saindo do programa. Obrigado!");
                    menuAtivo = false;
                    break;
                default:
                    System.out.println("\n> Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
    //MENU INICIAL 
    static void exibirMenu() {

        System.out.println("Menu Principal");
        System.out.println("---------------------");

        System.out.println("1. Cadastrar Conta - CC ou CP");
        System.out.println("2. Listar Contas");
        System.out.println("3. Localizar Conta");
        System.out.println("4. Editar Conta ");
        System.out.println("5. Remover Conta");
        System.out.println("0. Sair");
        System.out.println("----------------------");
        System.out.println("6. Métodos Bancários");
        System.out.println("----------------------");

        System.out.print("\nDigite a opção: ");
    }
    
    //MENU DE TIPO DE CONTA PARA CADASTRO
    static void escolherConta(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	
    	boolean ativo = true;
        while (ativo) {	
        	System.out.println("\nO TIPO DA SUA CONTA");
        	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    // colocar o identificador de tipo de conta 
                    criarContaCC(sc, cc);
                    break;
                case 2:
                	criarContaCP(sc, cp);
                    break;
                case 0:
                    System.out.println("\n> Voltando para o menu inicial.");
                    ativo = false;
                    break;
                default:
                    System.out.println("\n> Opção inválida. Tente novamente.");
                    break;
            }
         }
    }
    static void escolherSaque(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	
    	boolean ativo = true;
        while (ativo) {	
        	System.out.println("\nO TIPO DA SUA CONTA");
        	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    // colocar o identificador de tipo de conta 
                	realizarSaque(sc, cc);
                    break;
                case 2:
                	//criarContaCP(sc, cp);
                	realizarSaqueCP(sc,cp);
                    break;
                case 0:
                    System.out.println("\n> Voltando para o menu inicial.");
                    ativo = false;
                    break;
                default:
                    System.out.println("\n> Opção inválida. Tente novamente.");
                    break;
            }
         }
    }   
    static void escolherDeposito(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	
    	boolean ativo = true;
        while (ativo) {
        	System.out.println("\nO TIPO DA SUA CONTA CONTA");
        	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    // colocar o identificador de tipo de conta 
                	realizarDeposito(sc,cc);
                    break;
                case 2:
                	realizarDepositoCP(sc, cp);
                    break;
                case 0:
                    System.out.println("\n> Voltando para o menu inicial.");
                    ativo = false;
                    break;
                default:
                    System.out.println("\n> Opção inválida. Tente novamente.");
                    break;
            }
         }
    }
    static void escolherTransferencia(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	
    	boolean ativo = true;
        while (ativo) {
        	System.out.println("\nO TIPO DA SUA CONTA");
        	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    //colocar o identificador de tipo de conta 
                	realizarTransferenciaEntreContas(sc,cc,cp);
                    break;
                case 2:
                	//realizarTransferenciaCP(sc, cp);
                	realizarTransferenciaCP(sc,cp,cc);
                    break;
                case 0:
                    System.out.println("\n> Voltando para o menu inicial.");
                    ativo = false;
                    break;
                default:
                    System.out.println("\n> Opção inválida. Tente novamente.");
                    break;
            }
         }
    }

   //CRIANDO CONTA
   public static void criarContaCC(Scanner sc, ContaCorrente cc) {
    	
    	System.out.println("\n==============================");
        System.out.println("  Cadastrar Conta Corrente:  ");
        System.out.println("==============================");
        System.out.print("\n - O tipo de conta é Conta Corrente- ");
        int setTipoConta = 011;
        System.out.print("\nDigite o nome do titular da conta: ");
        String setNome = sc.next();
        System.out.print("\nDigite o cpf do titular: ");
        String setCpf = sc.next();
        System.out.print("\nDigite a agência: ");
        int setAgencia = sc.nextInt();
        sc.nextLine(); 
        Random gerarNumeroConta = new Random();        
        //gerar o numero da conta aleatorialmente
        for (int i = 1; i <=1; i++) {
        	
        }
        int setNumero = gerarNumeroConta.nextInt();
        System.out.print("\nSeu saldo inicial é R$0,00.   Deposite um valor em breve!\n");
        double setSaldo = 0;        
        cc.criarConta(setNome, setCpf,setAgencia, setNumero, setSaldo, setTipoConta);
    }
   public static void criarContaCP(Scanner sc, ContaPoupanca cp) {
    	
    	System.out.println("\n==============================");
        System.out.println("  Cadastrar Conta Poupança:  ");
        System.out.println("==============================");
        int setTipoConta = 015;
        System.out.print("\nDigite o nome do titular da conta: ");
        String setNome = sc.next();
        System.out.print("\nDigite o cpf do titular: ");
        String setCpf = sc.next();
        System.out.print("\nDigite a agência: ");
        int setAgencia = sc.nextInt();
        sc.nextLine(); 
        Random gerarNumeroConta = new Random();
        //gerar o numero da conta aleatorialmente
        for (int i = 1; i <=1; i++) {
        
        }
        int setNumero = gerarNumeroConta.nextInt();
        System.out.print("\nSeu saldo inicial é R$0,00.   Deposite um valor em breve!\n");
        double setSaldo = 0;
        cp.criarConta(setNome, setCpf,setAgencia, setNumero, setSaldo, setTipoConta);
    }    
   //LISTAR CONTAS EXISTENTES 
   static void listarContas(ContaCorrente cc, ContaPoupanca cp){
    	cc.listarContas();
    	cp.listarContas();
    }
    
    // buscar conta cadastrada
    static void localizarConta(Scanner sc, ContaCorrente cc) {
    	
        System.out.println("Localize uma conta");
        System.out.println("----------------------");

        System.out.print("\nDigite o número da conta: ");
        int setNumero = sc.nextInt();
        sc.nextLine();

        Conta contaSelecionada = cc.localizarConta(setNumero); 
        
        if (contaSelecionada != null) {
            System.out.println("Titular da conta: " + contaSelecionada.getNome());
        }else {
            System.out.println("\nAgência com o número " + setNumero + " não encontrada.");
        }
    }
    
    static void editarConta(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	System.out.println("EDITAR CONTA"); 
    	System.out.println("--------------------");

    	
    	boolean mnAtivo = true;
    	System.out.println("\nO TIPO DA SUA CONTA");
    	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
        while (mnAtivo) {
    	int opc = sc.nextInt();

	        switch (opc) {	        
	            case 1: 
	            	System.out.print("\nDigite o número da conta: ");
	                int setNumero = sc.nextInt();
	                sc.nextLine();
	                
	                Conta contaSelecionada = cc.localizarConta(setNumero);  
	                
	                if(contaSelecionada!= null) {
	                	System.out.println("Conta:  " +setNumero+ "| Titular"+contaSelecionada.getNome());
	                	System.out.println("Trocar nome do titular da conta"); 
	                	System.out.println("----------------------------------"); 
	                	System.out.println("Digite o nome atual: "); 
	                	String subNome= sc.next();
	                	contaSelecionada.setNome(subNome);
	                }else {
		            	System.out.print("\nConta não localizada.");

	                }
	            	System.out.print("\nDigite 0 para sair:");
	                break;	                
	            case 2:
	            	System.out.print("\nDigite o número da conta: ");
	                int numConta = sc.nextInt();
	                sc.nextLine();
	                
	                Conta contaSelecionadaCP = cc.localizarConta(numConta);  
	                
	                if(contaSelecionadaCP!= null) {
	                	System.out.println("Conta:  " +numConta+ "| Titular"+contaSelecionadaCP.getNome());
	                	System.out.println("Trocar nome do titular da conta"); 
	                	System.out.println("----------------------------------"); 
	                	System.out.println("Digite o nome atual: "); 
	                	String subNome= sc.next();
	                	contaSelecionadaCP.setNome(subNome);
	                }else {
		            	System.out.print("\nConta não localizada.");

	                }
	            	System.out.print("\nDigite 0 para sair:");
	                break;	   
	                
	            case 0:
	            	System.out.print("\nSaindo da sua conta...");
	            	mnAtivo=false;
	            	break;	            	
	            default:
	            	System.out.println("Opção inválida!!");
	        }
        }
    	
    }
  
    static void excluirConta(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	System.out.println("EXCLUIR CONTA"); 
    	System.out.println("--------------------"); 
    	boolean mnAtivo = true;
    	System.out.println("\nO TIPO DA CONTA");
    	System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
        while (mnAtivo) {
    	int opc = sc.nextInt();

	        switch (opc) {	        
	            case 1: 
	            	System.out.print("\nDigite o número da conta: ");
	                int setNumero = sc.nextInt();
	                sc.nextLine();

	                Conta contaSelecionada = cc.localizarConta(setNumero);  
	                
	                if (contaSelecionada != null) {
	                    cc.excluirConta(contaSelecionada);
	                    System.out.println("Conta:  " +setNumero+ " removida com sucesso.");
	                } else {
	                    System.out.println("Conta com o número " + setNumero + " não encontrada.");
	                }
	            	System.out.print("\nDigite 0 para sair:");
	                break;	                
	            case 2:
	            	System.out.print("\nDigite o número da conta: ");
	                int numConta = sc.nextInt();
	                sc.nextLine();

	                Conta contaSelecionadaCP = cp.localizarConta(numConta);  
	                
	                if (contaSelecionadaCP != null) {
	                    cc.excluirConta(contaSelecionadaCP);
	                    System.out.println("Conta:  " +numConta+ " removida com sucesso.");
	                } else {
	                    System.out.println("Conta com o número " + numConta + " não encontrada.");
	                }
	            	System.out.print("\nDigite 0 para sair:");
	                break;	   
	                
	            case 0:
	            	System.out.print("\nSaindo da sua conta...");
	            	mnAtivo=false;
	            	break;	            	
	            default:
	            	System.out.println("Opção inválida!!");
	        }
        }
    	// fim do loop
     // SE DER TEMPO CRIAR A CONDIÇÃO DE QUE A CONTA PRECISA ESTAR VAZIA PARA PODER SER EXCLUIDA.
    } 
    
    static void menuMetodosBancarios() {
    	
        System.out.println("\nQUAL OPERAÇÃO DESEJA REALIZAR? ");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Transferir");
        System.out.println("0. Cancelar");
        System.out.println("\nDigite a opção: ");
    }
    
    static void metodosBancarios(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {
    	
    	boolean mnAtivo = true;
    	menuMetodosBancarios();
        while (mnAtivo) {
    	int opc = sc.nextInt();

	        switch (opc) {	        
	            case 1:
	                // colocar o identificador de tipo de conta
	            	escolherSaque(sc, cc, cp); 
	            	//realizarSaque(sc, cc);	 
	            	System.out.print("\nDigite 0 para sair:");
	                break;	                
	            case 2:
	                // colocar o identificador de tipo de conta 
	            	escolherDeposito(sc, cc, cp); 
	            	System.out.print("\nDigite 0 para sair:");
	                break;	                
	            case 3:
	                // colocar o identificador de tipo de conta 
	            	escolherTransferencia(sc, cc, cp); 

	            	System.out.print("\nDigite 0 para sair:");
	                break;	                
	            case 0:
	            	System.out.print("\nSaindo da sua conta...");
	            	mnAtivo=false;
	            	break;	            	
	            default:
	            	System.out.println("Opção inválida!!");
	        }
        }
        exibirMenu();
    	//sc.close();
    }
    
    static void realizarDeposito(Scanner sc, ContaCorrente cc) {
    
    	System.out.print("\nDigite o número da conta: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cc.localizarConta(setNumero);
        
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome());
           System.out.println("Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor do depósito: ");
           double entrada =sc.nextDouble();
           double saida= entrada+contaSelecionada.getSaldo();
           contaSelecionada.setSaldo(saida);
           System.out.println("Depósito realizado!\n Saldo atual: R$ "+saida);
        }
    }
    
    static void realizarDepositoCP(Scanner sc, ContaPoupanca cp) {
        
    	System.out.print("\nDigite o número da conta: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cp.localizarConta(setNumero);
        
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome());
           System.out.println("Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor do depósito: ");
           double entrada =sc.nextDouble();
           double saida= entrada+contaSelecionada.getSaldo();
           contaSelecionada.setSaldo(saida);
           System.out.println("Depósito realizado!\n Saldo atual: R$ "+saida);
        }
    }
    
    static void realizarSaque(Scanner sc, ContaCorrente cc) {
    	System.out.print("\nDigite o número da conta: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cc.localizarConta(setNumero);
        
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome()+" | Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor do saque: ");
           double entrada =sc.nextDouble();
           
           //verificar se o saldo é suficiente para saque.
           if(entrada<=contaSelecionada.getSaldo()) {
	           double saida= contaSelecionada.getSaldo()-entrada;
	           contaSelecionada.setSaldo(saida);
	           System.out.println("Saque realizado!\n Saldo atual: R$ "+saida);
           }
           else {
        	   System.out.println("Valor de saldo insuficiente para saque.!");
		   System.out.println("Deseja sacar do seu Limite Especial?");
           }
        }
        //fim da execução
    }
    
    static void realizarSaqueCP(Scanner sc, ContaPoupanca cp) {
    	System.out.print("\nDigite o número da conta: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cp.localizarConta(setNumero);
        
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome()+" | Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor do saque: ");
           double entrada =sc.nextDouble();
           
           //verificar se o saldo é suficiente para saque.
           if(entrada<=contaSelecionada.getSaldo()) {
        	   double porc= entrada*0.02;
        	   //se o valor com o juros nao forem suficiente dará erro, 
        	   //a verificação deve ser já como juro acrescentado
	           double saida= contaSelecionada.getSaldo()-(entrada+porc);        	   
	         //  double saida= contaSelecionada.getSaldo()-entrada;
	           contaSelecionada.setSaldo(saida);
	           System.out.println("Saque realizado!\n Saldo atual: R$ "+saida);
           }//valor*porc 
           else {
        	   System.out.println("Valor de saldo insuficiente para saque.!");
           }
        }
        //fim da execução
    }
 /*   
    static void realizarTransferencia(Scanner sc, ContaCorrente cc) {
    	
    	System.out.println("\n==============================");
    	System.out.println("AREA DE TRANFERENCIA");
    	System.out.println("==============================");
    	
    	System.out.print("\nDigite o número da conta sua: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cc.localizarConta(setNumero);
        
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome()+" | Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor da tranferência: ");
           double entrada =sc.nextDouble();
           // verificar se o saldo é suficiente para saque.
           if(entrada<=contaSelecionada.getSaldo()) { 
	           double saida= contaSelecionada.getSaldo()-entrada;
	           contaSelecionada.setSaldo(saida);
	           
	           System.out.print("\nNúmero da conta que deseja tranferir o valor: ");
	           int numeroParaTransferencia = sc.nextInt();
	           sc.nextLine();
	           
	           Conta contaParaTransferencia = cc.localizarConta(numeroParaTransferencia);
	           
	           if (contaParaTransferencia != null) {
	              System.out.println("Titular da conta: " + contaParaTransferencia.getNome());
	              double recebeTrans= entrada+contaParaTransferencia.getSaldo();
	              contaParaTransferencia.setSaldo(recebeTrans);
	           }
	           
	       // System.out.println("Transferência realizado!\n Saldo atual: R$ ");
           }
           else {
        	   System.out.println("Valor de saldo insuficiente para saque.!");
           }
        }	
    	
    }
*/
    static void realizarTransferenciaCP(Scanner sc, ContaPoupanca cp, ContaCorrente cc) {
    	System.out.println("AREA DE TRANFERENCIA");
    	System.out.println("------------------------------------------");
    	
    	 System.out.print("\nDigite o número da conta sua: ");
        int setNumero = sc.nextInt();
        sc.nextLine();
        
        Conta contaSelecionada = cp.localizarConta(setNumero);
        if (contaSelecionada != null) {
           System.out.println("Titular da conta: " + contaSelecionada.getNome()+" | Saldo: R$" + contaSelecionada.getSaldo());
           System.out.println("Valor da tranferência: ");
           double entrada =sc.nextDouble();
           // verificar se o saldo é suficiente para saque.
           if(entrada<=contaSelecionada.getSaldo()) { 
	           double saida= contaSelecionada.getSaldo()-entrada;
	           contaSelecionada.setSaldo(saida);
           }
           System.out.print("\nQual o tipo da conta que deseja transferir: ");
			boolean ativo = true;
			while (ativo) {
				System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
				int op = sc.nextInt();
				switch (op) {
				case 1:
					System.out.print("\nNúmero da conta que deseja tranferir o valor: ");
					int numeroParaTransferenciaCC = sc.nextInt();
					sc.nextLine();
					Conta contaParaTransferenciaCC = cc.localizarConta(numeroParaTransferenciaCC);

					if (contaParaTransferenciaCC != null) {
						System.out.println("Titular da conta: " + contaParaTransferenciaCC.getNome());
						double recebeTrans = entrada + contaParaTransferenciaCC.getSaldo();
						contaParaTransferenciaCC.setSaldo(recebeTrans);
					} else {
						System.out.print("\nConta não locatizada.");
					}
					System.out.println("Transferência realizado!");
					break;

				case 2:
					// realizarTransferenciaCP(sc, cp);
					System.out.print("\nNúmero da conta que deseja tranferir o valor: ");
					int numeroParaTransferenciaCP = sc.nextInt();
					sc.nextLine();
					Conta contaParaTransferenciaCP = cp.localizarConta(numeroParaTransferenciaCP);

					if (contaParaTransferenciaCP != null) {
						System.out.println("Titular da conta: " + contaParaTransferenciaCP.getNome());
						double recebeTrans = entrada + contaParaTransferenciaCP.getSaldo();
						contaParaTransferenciaCP.setSaldo(recebeTrans);
					} else {
						System.out.print("\nConta não locatizada.");
					}
					System.out.println("Transferência realizado!");
					break;

				case 0:
					System.out.println("\n> Voltando para o menu inicial.");
					ativo = false;
					break;

				default:
					System.out.println("\n> Opção inválida. Tente novamente.");
					break;
				}
			}
		}
	}       		
    // Implementar caso haja tempo
    static void tratamento() {
		System.err.println("O tipo de entrada não é compatível. ");
    }
	static void realizarTransferenciaEntreContas(Scanner sc, ContaCorrente cc, ContaPoupanca cp) {

		System.out.println("AREA DE TRANFERÊNCIA");
		System.out.println("-------------------------");

		System.out.print("\nDigite o número da conta sua: ");
		int setNumero = sc.nextInt();
		sc.nextLine();
		Conta contaSelecionada = cc.localizarConta(setNumero);

		if (contaSelecionada != null) {
			System.out.println(
					"Titular da conta: " + contaSelecionada.getNome() + " | Saldo: R$" + contaSelecionada.getSaldo());
			System.out.println("Valor da tranferência: ");
			double entrada = sc.nextDouble();

			// verificar se o saldo é suficiente para saque.
			if (entrada <= contaSelecionada.getSaldo()) {
				double saida = contaSelecionada.getSaldo() - entrada;
				contaSelecionada.setSaldo(saida);

				System.out.print("\nQual o tipo da conta que deseja transferir: ");
				boolean ativo = true;
				while (ativo) {
					System.out.println("\n(1) Conta Corrente\n(2) Conta Poupança\n(0) Voltar");
					int op = sc.nextInt();

					switch (op) {
					case 1:
						System.out.print("\nNúmero da conta que deseja tranferir o valor: ");
						int numeroParaTransferenciaCC = sc.nextInt();
						sc.nextLine();
						Conta contaParaTransferenciaCC = cc.localizarConta(numeroParaTransferenciaCC);

						if (contaParaTransferenciaCC != null) {
							System.out.println("Titular da conta: " + contaParaTransferenciaCC.getNome());
							double recebeTrans = entrada + contaParaTransferenciaCC.getSaldo();
							contaParaTransferenciaCC.setSaldo(recebeTrans);
						} else {
							System.out.print("\nConta não locatizada.");
						}
						System.out.println("Transferência realizado!");
						break;

					case 2:
						// realizarTransferenciaCP(sc, cp);
						System.out.print("\nNúmero da conta que deseja tranferir o valor: ");
						int numeroParaTransferenciaCP = sc.nextInt();
						sc.nextLine();
						Conta contaParaTransferenciaCP = cp.localizarConta(numeroParaTransferenciaCP);

						if (contaParaTransferenciaCP != null) {
							System.out.println("Titular da conta: " + contaParaTransferenciaCP.getNome());
							double recebeTrans = entrada + contaParaTransferenciaCP.getSaldo();
							contaParaTransferenciaCP.setSaldo(recebeTrans);
						} else {
							System.out.print("\nConta não locatizada.");
						}
						System.out.println("Transferência realizado!");
						break;

					case 0:
						System.out.println("\n> Voltando para o menu inicial.");
						ativo = false;
						break;

					default:
						System.out.println("\n> Opção inválida. Tente novamente.");
						break;
					}
				}

			}
		}
	}
}
