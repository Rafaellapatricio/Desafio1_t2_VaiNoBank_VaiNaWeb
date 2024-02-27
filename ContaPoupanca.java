package br.com.vainaweb.vainubank;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupanca extends Conta {
	
	List<Conta> listaContas = new ArrayList<Conta>(100);
	
	public ContaPoupanca() {
		
	}
	
	public void criarConta(String nome, String cpf, int agencia, 
			int numero, double saldo, int tipoConta) {

		if (listaContas.size()> 100) {
            System.out.println("\n> Não temos mais contas disponíveis.");
        }
		
		listaContas.add(new Conta(nome, cpf, agencia, numero, saldo, tipoConta));   
	}
	
	// LISTAR
	public  void listarContas(){
        System.out.println("LISTA DE CONTAS DO TIPO POUPANÇA");
        System.out.println("-----------------------------------");

        for(Conta c: listaContas) {
			System.out.println(". Titular: " + c.getNome() + " | CPF: " + c.getCpf()+
					"| Agência: " + c.getAgencia()+ "| Número:  "+ c.getNumero()+
					"| Saldo: " + c.getSaldo()+"| Tipo de Conta: "+c.getTipoConta());
		}
	}
	// LOCALIZAR
	public Conta localizarConta(int numero) {	
		for(Conta c: listaContas) {
				if(c.getNumero() == numero) {
					return c;
				}
			}
			return null;
		}
	// EXCLUIR
	public void excluirConta(Conta contaSelecionada) {
		listaContas.remove(contaSelecionada);
	}
	//SACAR COM 2% DE JUROS
	public void realizarSaque(double porc) {
		
		//listaContas.getSaldo()-porc;
		//todo saque tera um acrescimo de 2% de juros em cima do valor	
	}	
}