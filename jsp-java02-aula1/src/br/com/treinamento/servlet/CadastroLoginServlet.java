package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinamento.domain.Usuario;
import br.com.treinamento.service.UsuarioService;

public class CadastroLoginServlet extends HttpServlet {

	private static final long serialVersionUID = -6468699447722680504L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Usuario usuario = new Usuario(req.getParameter("nome"),
				req.getParameter("login"), req.getParameter("senha"));

		UsuarioService service = new UsuarioService();
		service.salvar(usuario);
		resp.sendRedirect("/jsp/listagemUsuario.jsp");

	}

}
