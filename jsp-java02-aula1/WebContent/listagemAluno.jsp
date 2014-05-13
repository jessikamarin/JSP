<%@page import="br.com.treinamento.service.AlunoService"%>
<%@page import="java.util.List"%>
<%@page import="br.com.treinamento.domain.Aluno"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="header.jsp"%>
<title>Listagem de alunos</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#novoAluno').click(function() {
			window.location = "/jsp/cadastroAluno.jsp";
		});
	});
</script>

</head>
<body>
	<%@include file="menu.jsp"%>
	
	<form>
		<h1>Alunos</h1>
		<div class="conteudo">
			<table class="table table-hover">
				<thead>
				<tr>
					<th>Nome</th>
					<th>Data Nascimento</th>
					<th>Telefone</th>
				</tr>
				</thead>
				<tbody>
				<%
					AlunoService service = new AlunoService();
					List<Aluno> alunos = service.buscarAlunos();
					
					for(Aluno aluno: alunos){
				%>
				<tr>
					<td><%= aluno.getNome() %></td>
					<td><%= aluno.getDataNascimento() %></td>
					<td><%= aluno.getTelefone() %></td>
				</tr>	
				<%
					}
				%>
				</tbody>	
			</table>
			<div class="app-buttons">
				<input id="novoAluno" type="button" class="btn btn-primary" value="Novo"/>
			</div>
		</div>
	</form>
	
</body>
</html>