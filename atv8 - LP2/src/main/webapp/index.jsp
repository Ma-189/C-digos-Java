<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 2</title>
<style> 
table {
	margin: 30px auto;
	padding: 20px;
	background-color: #EBFFFE;
}
</style>
</head>
<body>
<form action="conteudo">
<table>
<tr>
<td> Assunto: </td>
<td><input type="text" name="assunto"/></td>
</tr>

<tr>
<td> Mensagem: </td>
<td><input type="text" name="mensagem"/></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="ENVIAR"/></td>
</tr>
</table>
</form>

</body>
</html>