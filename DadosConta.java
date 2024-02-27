package br.com.vainaweb.vainubank;

public abstract class DadosConta {
	private String nome;
	private String cpf;
	private int agencia;
	private Integer numero;

	public DadosConta() {
		
	}
	
	public DadosConta(String nome, String cpf, int agencia, Integer numero) {
		
		this.nome= nome;
		this.cpf=cpf;
		this.agencia=agencia;
		this.numero=numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
