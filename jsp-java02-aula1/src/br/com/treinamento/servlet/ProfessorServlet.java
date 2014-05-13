package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinamento.service.ProfessorService;

public class ProfessorServlet extends HttpServlet {

	private static final long serialVersionUID = 9206874176594058941L;

	public ProfessorService service;

	@Override
	public void init() throws ServletException {
		service = new ProfessorService();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		service.criarProfessor(req.getParameter("nome"),
				req.getParameter("dataNascimento"),
				req.getParameter("telefone"));

		resp.sendRedirect("/jsp/listagemProfessor.jsp");
	}
}
