package javaOO;

import java.util.Date;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String dtCadastro;
	
	public Cliente(String nome, String sobrenome, String cpf, String dtCadastro) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.dtCadastro = dtCadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getdtCadastro() {
		return dtCadastro;
	}
	public void setDtNascimento(String dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	public void mostrarDados() {
		System.out.println("Nome do(a) cliente: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de cadastro: " + this.dtCadastro);
		System.out.println("---------------------------------------");
	}

	
	
}
