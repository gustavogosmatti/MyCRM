<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Cadastrar Cliente</h1>
	<hr>
	<form action="/MyCRM/CadastrarClienteServlet" method="post">
		Nome:<input type="text" id="nome" name="nome" value="">
		Sobrenome:<input type="text" id="sobrenome" name="sobrenome" value="">
		Email:<input type="text" id="email" name="email" value="">
		Telefone:<input type="text" id="telefone" name="telefone" value="">
		<input type="submit" value="Save">
	</form>
</body>
</html>