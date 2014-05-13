package br.com.treinamento.service;

import java.util.List;

import javax.persistence.Query;

import br.com.treinamento.domain.Aluno;

public class AlunoService extends AbstractService<Aluno> {

	public AlunoService() {
		super(Aluno.class);
	}

	public void criarAluno(String nome, String dataNascimento, String telefone) {
		Aluno aluno = new Aluno(nome, dataNascimento, telefone);
		this.salvar(aluno);

	}
	
	@SuppressWarnings("unchecked")
	public List<Aluno> buscarAlunos() {

		String queryStr = "FROM " + Aluno.class.getSimpleName();
		Query qry = this.getEm().createQuery(queryStr);

		return qry.getResultList();

	}

}
