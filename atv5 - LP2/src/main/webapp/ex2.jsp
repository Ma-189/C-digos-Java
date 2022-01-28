<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Array</title>
</head>
<body>

<%!

public ArrayList<Integer> array() {
	
	ArrayList<Integer> mult = new ArrayList<>();
	
		for(int i=1; i<=10000; i++) {
		if(i%5==0) 
			mult.add(i);	
		}
		
		return mult;
	}	

%>

<h1>Exercício 2</h1>
<h2>Múltiplos de 5 entre 1 e 10000</h2>
<table>
	<tr><% for(int j= 0; j<array().size();j++) { 
	if (j % 20 == 0) { %>
	<tr>
	<%}%>
		<td><%= array().get(j)%></td>
		<%}%>
	<tr>
</table>
</body>
</html>