<%@page import="br.com.treinamento.service.UsuarioService"%>
<%@page import="java.util.List"%>
<%@page import="br.com.treinamento.domain.Usuario"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="header.jsp"%>
<title>Listagem de usuários</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#novoUsuario').click(function() {
			window.location = "/jsp/cadastroUsuario.jsp";
		});

		$('.excluir').click(function() {
			var idExcluir = $(this).closest('td').siblings('.oculto').text();
			$('#idUsuario').val(idExcluir);
			$('form.oculto').submit();
		})
	});
</script>

</head>
<body>
	<%@include file="menu.jsp"%>

	<form>
		<h1>Usuários</h1>
		<div class="conteudo">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Login</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<%
						UsuarioService service = new UsuarioService();
						List<Usuario> usuarios = service.buscarUsuarios();

						for (Usuario usuario : usuarios) {
					%>
					<tr>
						<td class="oculto"><%=usuario.getId()%></td>
						<td><%=usuario.getNome()%></td>
						<td><%=usuario.getLogin()%></td>
						<td><a class="excluir btn btn-info">Excluir</a></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<div class="app-buttons">
				<input id="novoUsuario" type="button" class="btn btn-primary"
					value="Novo" />
			</div>
		</div>
	</form>

	<form class="oculto" id="excluirForm" action="/jsp/excluirUsuario"
		method="post">
		<input type="text" id="idUsuario" name="idUsuario" />
	</form>

</body>
</html>