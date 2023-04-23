package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hora2")
public class Hora2 extends HttpServlet{
	
	private static final long serialVersionUID = 1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
			PrintWriter writer = response.getWriter();
			
			writer.append( "<!DOCTYPE html>" );
			writer.append( " <HTML> " );
			writer.append( " <BODY> " );
			writer.append( " <H1> 8:00 </H1> " );
			writer.append( "</BODY> " );
			writer.append( " </HTML> " );

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
