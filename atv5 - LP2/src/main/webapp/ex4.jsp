<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabuadas</title>
</head>
<body>
<h1>Exercício 4</h1>
<h2>Tabuada do 10</h2>
<table>

<%
	for(int i=1; i<=10; i++) {
%>
	<tr>
		<td>10</td>
		<td>x</td>
		<td><%= i%></td>
		<td>=</td>
		<td><%= i * 10%></td>
	<tr>
	<%
		}
	%>
</table>

<h2>Tabuada do 12</h2>
<table> 
<%
	for(int i=1; i<=10; i++) {
%>
	<tr>
		<td>12</td>
		<td>x</td>
		<td><%= i%></td>
		<td>=</td>
		<td><%= i * 12%></td>
	<tr>
	<%
		}
	%>
</table>

<h2>Tabuada do 14</h2>
<table> 
<%
	for(int i=1; i<=10; i++) {
%>
	<tr>
		<td>14</td>
		<td>x</td>
		<td><%= i%></td>
		<td>=</td>
		<td><%= i * 14%></td>
	<tr>
	<%
		}
	%>
</table>

<h2>Tabuada do 16</h2>
<table> 
<%
	for(int i=1; i<=10; i++) {
%>
	<tr>
		<td>16</td>
		<td>x</td>
		<td><%= i%></td>
		<td>=</td>
		<td><%= i * 16%></td>
	<tr>
	<%
		}
	%>
</table>
</body>
</html>