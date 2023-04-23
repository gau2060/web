package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hora3")
public class Hora3 extends HttpServlet{
	
	private static final long serialVersionUID = 1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
			Date date = Calendar.getInstance().getTime();
			String hora = new SimpleDateFormat("HH:mm:ss").format(date);
			
			PrintWriter writer = response.getWriter();
			
			writer.append( "<!DOCTYPE html>" );
			writer.append( " <HTML> " );
			writer.append( " <BODY> " );
			writer.append( " <H1>" );
			writer.append( hora );
			writer.append( " </H1> " );
			writer.append( "</BODY> " );
			writer.append( " </HTML> " );

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
