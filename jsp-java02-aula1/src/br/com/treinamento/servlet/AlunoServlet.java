package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinamento.domain.Aluno;
import br.com.treinamento.service.AlunoService;

public class AlunoServlet extends HttpServlet {

	private static final long serialVersionUID = -9121976755448941615L;

	private AlunoService service;

	@Override
	public void init() throws ServletException {
		service = new AlunoService();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		service.criarAluno(req.getParameter("nome"),
				req.getParameter("dataNascimento"),
				req.getParameter("telefone"));

		for (Aluno a : service.buscarTodos()) {
			System.out.println(a);

		}

	}

}
