package br.com.vainaweb.vainubank;

public class Conta extends DadosConta{
	private double saldo=0.0;
	private int tipoConta;
	public Conta() {
		super();
	}
	
	public Conta(String nome, String cpf, int agencia, Integer numero, double saldo, int tipoConta) {
		super(nome,cpf,agencia,numero);
		this.saldo=saldo;
		this.tipoConta=tipoConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
}
