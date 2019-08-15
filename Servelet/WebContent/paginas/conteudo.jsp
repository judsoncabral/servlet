<%@page import="br.ufrn.imd.servlet.dominio.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página principal</title>
</head>
<body>

<p>
 Usuário <b> <%= ((Usuario) 
			session.getAttribute("usuario")).getNome() %> </b>
</p> 

<!--  URL de sair, form de cadastro de usuário, que direciona para a listagem -->			



</body>
</html>