package br.com.treinamento.service;

import br.com.treinamento.domain.Aluno;

public class AlunoService extends AbstractService<Aluno> {

	public AlunoService() {
		super(Aluno.class);
	}

	public void criarAluno(String nome, String dataNascimento, String telefone) {
		Aluno aluno = new Aluno(nome, dataNascimento, telefone);
		this.salvar(aluno);

	}

}
