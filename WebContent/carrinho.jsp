<%@page import="java.util.List"%>
<%@page import="entities.Produto"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carrinho</title>
</head>
<body>

<h1>Lista de Produtos</h1>

<%
	List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
%>
<table border="1" width="100%";>
<tr>
	<td align="center"><strong>Produto</strong></td>
	<td align="center"><strong>Valor</strong>
</tr>
<% for (Produto p : produtos) { %>
	<tr>
		<td align="center"><%= p.getNome() %></td>
		<td align="center"><%= p.getValor() %></td>
	</tr>
<% } %>	
</table>
</body>
</html>