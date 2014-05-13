package br.com.treinamento.service;

import br.com.treinamento.domain.Professor;

public class ProfessorService extends AbstractService<Professor> {

	public ProfessorService() {
		super(Professor.class);
	}

	public void criarProfessor(String nome, String dataNascimento,
			String telefone) {
		Professor professor = new Professor(nome, dataNascimento, telefone);
		this.salvar(professor);
	}

}
