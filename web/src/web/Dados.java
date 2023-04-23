package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dados")
public class Dados extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException {
		
		try{
			
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			PrintWriter writer = response.getWriter();
			
			writer.append( " <HTML> " );
			writer.append( " <BODY> " );
			
			if(login!=null && senha!=null &&  !login.equalsIgnoreCase(senha) ) {
				writer.append( "Login: " + login + " senha: " + senha);
			}else {
				writer.append("Usuario ou Senha Invalidos!");
			}
				
			writer.append( "</BODY> " );
			writer.append( " </HTML> " );

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
