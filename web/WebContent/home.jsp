<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Aula Web</title>
	</head>
	<body>
<%-- 		Olá, <%=request.getParameter("login")%> --%>
		<%			
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			out.print("Login: " + login);
			out.print("<br>");
			out.print( "Senha: " + senha);			
		%>

	</body>
</html>