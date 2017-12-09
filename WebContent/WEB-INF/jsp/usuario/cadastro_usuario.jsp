<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuário</title>
</head>
<body>
	<h3>Cadastro de Usuário</h3>
	<form action="/permuta/cadastro_usuario.do" method="post">
		Nome: <input type="text" name="nome"> <br/>
		Apelido: <input type="text" name="apelido"> <br/>
		CPF: <input type="text" name="cpf"> <br/>
		Data Nascimento: <input type="text" name="data_nasc"> <br/>
		Foto do perfil: <input type="text" name="foto_perfil"> <br/>
		E-mail: <input type="text" name="email"> <br/>
		Senha: <input type="password" name="senha"> <br/>
		<input type="submit" value="Cadastrar Usuário" name="cadastrar_usuario">
	</form>
</body>
</html>