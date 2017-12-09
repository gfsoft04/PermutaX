<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.gfsoft.permuta.model.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Perfil</title>
</head>
<body>
<%Usuario usuario = (Usuario) request.getAttribute("usuario");%>
	<h5><%=usuario.getApelido()%></h5> <br/>
	
	<label for="nome">Nome:</label>
	<h6><%=usuario.getNome()%></h6>
	<label for="data_nasc">Data de Nascimento:</label>
	<h6><%=usuario.getDataNasc()%></h6>
	<label for="email">E-mail:</label>
	<h6><%=usuario.getConta().getEmail()%></h6>
	<label for="endereco">Endereço:</label>
	<h6><%=usuario.getEndereco().getCidade()%></h6>
	
	<a href="/permuta/servico/cadastrar_servico.html">Cadastrar Meu Serviço</a>
 	
 	<!-- <a href="/permuta/cadastro_servico.do">Cadastrar Meu Serviço</a> -->
	
</body>
</html>