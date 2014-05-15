<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="d" uri="/WEB-INF/SubstrDescriptor.tld"%>
<html>
<head>
<%@include file="header.jsp" %>
<title>Cadastro de Usuário</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#voltar').click(function() {
			window.location = "/jsp/listagemUsuario.jsp";
		});
	});
</script>

</head>
	<body>
		<%@include file="menu.jsp" %>

	<form action="/jsp/cadastrologin" method="POST">
		<h1>Usuários</h1>
		<div class="well conteudo">
			<fieldset>
				<div class="input-group">
					<label for="nome">Nome:</label>
					<input type="text" name="nome" class="form-control"
						placeholder="Nome" />
				</div>	
									
				<div class="input-group">	
					<label for="login">Login:</label>
					<input type="date" name="login" 
						class="form-control" placeholder="Login"/>
				</div>
				
				<div class="input-group">
					<label for="senha">Senha:</label>
					<input type="password" name="senha" class="form-control" 
						placeholder="Senha"/>
				</div>
				
				<d:labelInput componentLabel="Campo taglib" componentId="campoTagLib" componentName="campoTagLib"></d:labelInput>
				
				<div class="app-buttons">
					<input type="submit" value="Gravar" class="btn btn-success"/>
					<input id="voltar" type="button" value="Voltar" class="btn btn-primary"/>
				</div>
			</fieldset>	
		</div>		
		
	</form>

</body>
</html>