package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResgatandoCookies")
public class ResgatandoCookies extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
					
			
			Cookie cookies[] = null;
			
			cookies = request.getCookies();
			
			
			PrintWriter writer = response.getWriter();
			
			writer.append( "<!DOCTYPE html>" );
			writer.append( " <HTML> " );
			writer.append( " <BODY> " );
			writer.append( " <H1> Exemplo de Cookies </H1> " );
			
			if (cookies != null) {
				Cookie cookie = null;
				
				for (int i=0; i< cookies.length; i++) {
					cookie = cookies[i];
					writer.append("Nome: " + cookie.getName() + ", ");
					writer.append("Valor: " + cookie.getValue() + "<br>");
					
				}
				
				
			}
			
			writer.append( "</BODY> " );
			writer.append( " </HTML> " );
			
			/*
			cookies[0].setMaxAge(0);
			response.addCookie(cookies[0]);
			*/
			
			/*
			Cookie cookie = new Cookie("Nome", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			*/

		} catch (IOException e){
			e.printStackTrace();
		}
	}

}

