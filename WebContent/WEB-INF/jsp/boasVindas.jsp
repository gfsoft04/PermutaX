<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
</head>
<body>	
	<h2>Login</h2>
	<form action="/permuta/logar" method="post">
		<div>
			<label for="email">E-mail:</label>
			<input type="text" name="email">
		</div>
			<!-- <br/> --> 
		<div>
			<label for="senha">Senha:</label>
			<input type="password" name="senha">
		</div>
		<div class="button">
			<button type="submit">Entrar</button> <!--<input type="submit" value="Entrar" name="logar_usuario">-->
		</div>		
	</form>
	
	<h3>Cadastro de Usuário</h3>
	<form action="/permuta/usuario/cadastro_usuario" method="post">
		<div>
			<label for="nome">Nome:</label>
			<input type="text" name="nome">
		</div>
		<div>
			<label for="apelido">Apelido:</label>
			<input type="text" name="apelido">
		</div>
		<div>
			<label for="cpf">CPF:</label>
			<input type="text" name="cpf">
		</div>
		<div>
			<label for="data_nasc">Data de Nascimento:</label>
			<input type="text" name="data_nasc">
		</div>
		<div>
			<label for="foto">Foto do perfil:</label>
			<input type="text" name="foto_perfil">
		</div>
		<div>
			<label for="nacionalidade">Nacionalidade:</label>
			<input type="text" name="nacionalidade">
		</div>
		<div>
			<label for="cep">CEP:</label>
			<input type="text" name="cep">
		</div>
		<div>
			<label for="cidade">Cidade:</label>
			<input type="text" name="cidade">
		</div>
		<div>
			<label for="bairro">Bairro:</label>
			<input type="text" name="bairro">
		</div>
		<div>
			<label for="rua">Rua:</label>
			<input type="text" name="rua">
		</div>
		<div>
			<label for="numero">Número:</label>
			<input type="text" name="numero">
		</div>
		<div>
			<label for="email">E-mail:</label>
			<input type="text" name="email">
		</div>		
		<div>
			<label for="senha">Senha:</label>
			<input type="password" name="senha">
		</div>		
		<div class="button">
			<button type="submit">Cadastrar</button> <!-- <input type="submit" value="Cadastrar Usuário" name="cadastrar_usuario"> -->
		</div>		
	</form>
	
	<!-- <a href="/permuta/cadastro_usuario">cadastro_usuario</a> -->

</body>
</html>