package br.com.treinamento.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinamento.domain.Usuario;

public class LoginFilter implements Filter {

	private static final String LOGIN_PAGE = "/jsp/login.html";
	private static final String LOGIN_URL = "/jsp/login";
	private static final String CSS_URL = "/jsp/css";

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpServletRequest req = (HttpServletRequest) request;

		Usuario usuario = (Usuario) req.getSession().getAttribute(
				"usuarioLogado");

		if ((usuario != null) || (req.getRequestURI().equals(LOGIN_PAGE))
				|| (req.getRequestURI().equals(LOGIN_URL))
				|| (req.getRequestURI().contains(CSS_URL))) {
			chain.doFilter(req, resp);
		} else {
			resp.sendRedirect(LOGIN_PAGE);

		}
	}

	@Override
	public void destroy() {

	}

}
