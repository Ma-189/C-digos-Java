<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
    <%@ page import="conteudo.Conteudo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 4</title>
</head>
<body>
    <h1>Lista de conteúdos adicionados: </h1>
    <table>
    <tr>
        <th>Assunto</th>
        <th>Mensagem</th>
    </tr>
    <% ArrayList<Conteudo> lista = (ArrayList<Conteudo>)session.getAttribute("lista");
    for(Conteudo conteudo : lista){ %>
        <tr>
            <td><%= conteudo.getAssunto() %></td>
            <td><%= conteudo.getMensagem() %> </td>
        </tr>
    <% }%>
    </table><br>
    <a href="index.jsp" class="clique">Clique aqui</a> se desejar adicionar mais conteúdos.
</body>
</html>