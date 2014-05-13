<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="header.jsp" %>
<title>Cadastro de Professor</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#voltar').click(function() {
			window.location = "/jsp/listagemProfessor.jsp";
		});
	});
</script>

</head>
	<body>
		<%@include file="menu.jsp" %>

    <form action="/jsp/cadastroProfessor" method="POST">
    	<h1>Professores</h1>
		<div class="well conteudo">
			<fieldset>
				<div class="input-group">
					<label for="nome">Nome:</label>
					<input type="text" name="nome" class="form-control"
						placeholder="Nome" />
				</div>	
					
				<div class="input-group">	
					<label for="dataNascimento">Data Nascimento:</label>
					<input type="date" name="dataNascimento" 
						class="form-control" placeholder="Data Nascimento"/>
				</div>
				
				<div class="input-group">
					<label for="telefone">Telefone:</label>
					<input type="text" name="telefone" class="form-control" 
						placeholder="Telefone"/>
				</div>
				
				<div class="app-buttons">
					<input type="submit" value="Gravar" class="btn btn-success"/>
					<input id="voltar" type="button" value="Voltar" class="btn btn-primary"/>
				</div>
			</fieldset>	
		</div>		
		
	</form>

</body>
</html>