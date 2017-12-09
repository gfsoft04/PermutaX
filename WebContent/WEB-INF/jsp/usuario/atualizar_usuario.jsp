<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.gfsoft.permuta.model.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualização de Usuário</title>
</head>
<body>
	<h3>Atualização de Usuário</h3>
	<% Usuario usuario = (Usuario) request.getAttribute("usuario"); %>
	<form action="/permuta/usuario/atualizar_usuario.do" method="post">
		Nome: <input type="text" value="<%=usuario.getNome()%>" name="nome"> <br/>
		Apelido: <input type="text" value="<%=usuario.getApelido()%>" name="apelido"> <br/>
 		CPF: <input type="text" value="<%=usuario.getCpf()%>" name="cpf"> <br/>
<%-- 		<!--Data Nascimento: <input type="text" value="<%=dataNasc%>" name="data_nasc"> <br/>--> --%>
 		Foto do perfil: <input type="text" value="<%=usuario.getUrlFoto()%>" name="foto_perfil"> <br/>
 		E-mail: <input type="text" value="<%=usuario.getConta().getEmail()%>" name="email"> <br/>
		<input type="hidden" value="<%=usuario.getId()%>" name="id"> <br/>
		<input type="submit" value="Atualizar Usuário" name="atualizar_usuario">
	</form>
</body>
</html>