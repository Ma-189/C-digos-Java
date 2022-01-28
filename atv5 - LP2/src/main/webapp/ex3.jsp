<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.time.LocalDate" %>
<%@ page import = "java.time.format.DateTimeFormatter" %>

<%
	LocalDate date = LocalDate.now();
	DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
	String texto = date.format(formatters);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datas</title>
</head>
<body>
<h1>Exercício 3</h1>
<h2>Data dos últimos 7 dias</h2>
<%!
	java.time.LocalDate datas;
	
%>

<% datas = java.time.LocalDate.now(); %>

<table> 
	<tr><% for(int i=7; i>0; i--){ %>
		<tr>
		<td><%= datas.minusDays(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %></td><tr>
	<%
		}
	%>
	</tr>
</table>
</body>
</html>