<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<%@include file="header.jsp" %>
<title>Exemplo Listagem</title>
</head>
	<body>
		<%
			String[] frutas = new String[4];
			frutas[0] = "Cereja";
			frutas[1] = "Maçã";
			frutas[2] = "Goiaba";
			frutas[3] = "Laranja";
			
			for(int i = 0 ; i < frutas.length ; i++) {
		%>
			Fruta[<%=i %>] = <%= frutas[i] %> <br/>
		<% } %>
			
	</body>
</html>