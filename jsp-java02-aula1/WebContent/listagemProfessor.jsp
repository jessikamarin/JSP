<%@page import="br.com.treinamento.service.ProfessorService"%>
<%@page import="java.util.List"%>
<%@page import="br.com.treinamento.domain.Professor"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<%@include file="header.jsp"%>
<title>Listagem de professores</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#novoProfessor').click(function() {
			window.location = "/jsp/cadastroProfessor.jsp";
		});
	});
</script>

</head>
<body>
	<%@include file="menu.jsp"%>
	
	<form>
		<h1>Professores</h1>
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
					ProfessorService service = new ProfessorService();
					List<Professor> professores = service.buscarTodos();
					
					for(Professor professor: professores){
				%>
				<tr>
					<td><%= professor.getNome() %></td>
					<td><%= professor.getDataNascimento() %></td>
					<td><%= professor.getTelefone() %></td>
				</tr>	
				<%
					}
				%>
				</tbody>	
			</table>
			<div class="app-buttons">
				<input id="novoProfessor" type="button" class="btn btn-primary" value="Novo"/>
			</div>
		</div>
	</form>
	
</body>
</html>