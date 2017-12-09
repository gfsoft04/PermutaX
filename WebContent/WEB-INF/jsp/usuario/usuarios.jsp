<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="br.com.gfsoft.permuta.model.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Usuários</title>
</head>
<body>
	<h3>Usuários</h3>
	<table>
	<%List<Usuario> listaUsuarios = (List<Usuario>) request.getAttribute("listaUsuarios");
		for(Usuario usuario : listaUsuarios) {
	%>
	 	<tr> <td> <%= usuario.getNome() %> </td> <td> <a href="/permuta/usuario/remover.do?id=<%=usuario.getId()%>">remover</a> </td> <td> <a href="/permuta/usuario/atualizar_usuario.do?id=<%=usuario.getId()%>">atualizar</a> </td> </tr> <br/>	 	
	<%}%>
	
	</table>
</body>
</html>