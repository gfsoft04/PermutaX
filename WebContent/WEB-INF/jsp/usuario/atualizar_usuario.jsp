<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.gfsoft.permuta.model.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualiza��o de Usu�rio</title>
</head>
<body>
	<h3>Atualiza��o de Usu�rio</h3>
	<% Usuario usuario = (Usuario) request.getAttribute("usuario"); %>
	<form action="/permuta/usuario/atualizar_usuario.do" method="post">
		Nome: <input type="text" value="<%=usuario.getNome()%>" name="nome"> <br/>
		Apelido: <input type="text" value="<%=usuario.getApelido()%>" name="apelido"> <br/>
 		CPF: <input type="text" value="<%=usuario.getCpf()%>" name="cpf"> <br/>
<%-- 		<!--Data Nascimento: <input type="text" value="<%=dataNasc%>" name="data_nasc"> <br/>--> --%>
 		Foto do perfil: <input type="text" value="<%=usuario.getUrlFoto()%>" name="foto_perfil"> <br/>
 		E-mail: <input type="text" value="<%=usuario.getConta().getEmail()%>" name="email"> <br/>
		<input type="hidden" value="<%=usuario.getId()%>" name="id"> <br/>
		<input type="submit" value="Atualizar Usu�rio" name="atualizar_usuario">
	</form>
</body>
</html>