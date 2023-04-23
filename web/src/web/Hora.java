package web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hora")
public class Hora extends HttpServlet{
	private static final long serialVersionUID = 1;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		try{
			response.getWriter().append("8:00");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
