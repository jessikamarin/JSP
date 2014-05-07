package br.com.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.treinamento.domain.Usuario;
import br.com.treinamento.exception.UsuarioNaoAutorizadoException;
import br.com.treinamento.service.UsuarioService;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 3527542414415403494L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String usuario = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		UsuarioService service = new UsuarioService();
		Usuario usuarioBanco = service.buscarUsuario(usuario, senha);

		if (usuarioBanco != null) {
			HttpSession sessao = req.getSession();
			sessao.setAttribute("usuarioLogado", usuarioBanco);
			resp.sendRedirect("/jsp/index.html");
		} else {
			throw new ServletException(new UsuarioNaoAutorizadoException());
		}
	}
}
