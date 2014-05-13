package br.com.treinamento.domain;

import javax.persistence.Entity;

@Entity
public class Professor extends MyAbstractEntity {

	private String nome;
	private String dataNascimento;
	private String telefone;

	public Professor(String nome, String dataNascimento, String telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}

	public Professor() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
