<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>    
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
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
		
		<jsp:useBean id="frutas2" class="java.util.ArrayList"></jsp:useBean>
		<% 
			frutas2.add("Fruta 1");
			frutas2.add("Fruta 2");
			frutas2.add("Fruta 3");	
		%>
		<c:forEach var="i" begin="1" end="5">
		Iteração <c:out value="${frutas2[i]}"></c:out>
		</c:forEach>
		
		<table>
			<c:forEach var="fruta" items="${frutas2}">
				<tr>
					<td>oio</td>
					<td>${fruta}</td>
				</tr>
			
			</c:forEach>
		</table>
			
	</body>
</html>