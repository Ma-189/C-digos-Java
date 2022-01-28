<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Número randômico</title>
</head>
<%!
	public Integer marcela() {
		Random valor = new Random();
		return valor.nextInt(999)+1;
	}
%>
<body>
<h1>Exercício 1</h1>
<h2> Número randômico: <%= marcela() %> </h2>
</body>
</html>