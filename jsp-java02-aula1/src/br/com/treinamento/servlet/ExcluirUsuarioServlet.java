package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinamento.domain.Usuario;
import br.com.treinamento.service.UsuarioService;

public class ExcluirUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = -4345246328119765224L;

	public UsuarioService service;

	@Override
	public void init() throws ServletException {
		service = new UsuarioService();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Usuario usuario = service.buscarPorId(Long.parseLong(req
				.getParameter("idUsuario")));

		service.remove(usuario);

		resp.sendRedirect("/jsp/listagemUsuario.jsp");

	}

}
