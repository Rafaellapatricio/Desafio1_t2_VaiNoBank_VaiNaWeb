package br.com.vainaweb.vainubank;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements Operacoes{
	
	private List<Conta> listaContas = new ArrayList<Conta>(100);

	public ContaCorrente() {	
		
	}

	@Override
	public void Transferir() {
		// verificar se a outra conta existe e adicionar o valor a essa conta
	}

	//funcao para verificar se o saldo é menor igual a 0; ou maior que o valor que quer tirar.
	// CADASTRAR
	public void criarConta(String nome, String cpf, int agencia, int numero, double saldo, int tipoConta) {

		if (listaContas.size()> 100) {
            System.out.println("\n> Não temos mais contas disponíveis.");
        }
		
		listaContas.add(new Conta(nome, cpf, agencia, numero, saldo, tipoConta));   
	}
	
	// LISTAR
	public  void listarContas(){
        System.out.println("LISTA DE CONTAS DO TIPO CORRENTE");
        System.out.println("-----------------------------------");

        for(Conta c: listaContas) {
			System.out.println(". Titular: " + c.getNome() + " | CPF: " + c.getCpf()+
					"| Agência: " + c.getAgencia()+ "| Número:  "+ c.getNumero()+
					"| Saldo: " + c.getSaldo()+"| Tipo de Conta: "+c.getTipoConta());
		}
	}
	// LOCALIZAR
	public Conta localizarConta(int numero) {
		// trocar o for
		for(Conta c: listaContas) {
		//for(int i=0; i<=10;i++) {
			if(c.getNumero() == numero) {
				return c;
			}
		}
		return null;
	}
	
	@Override
	public void Sacar() {
		
	}
	public void excluirConta(Conta contaSelecionada) {
		listaContas.remove(contaSelecionada);
	}

}	
