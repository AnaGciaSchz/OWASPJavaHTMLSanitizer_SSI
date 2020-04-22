package com.uniovi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Clase para saludar al usuario
 * @author Ana Garcia
 *
 */
@WebServlet("/ServletSaludo")
public class ServletSaludo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletSaludo() {
        super();
    }

	/**
	 * Método para saludar al usuario
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		 throws ServletException, IOException {
    		 response.setContentType("text/html");
    		 PrintWriter out = response.getWriter();
    		 out.println("<HTML>");
    		 out.println("<HEAD><TITLE>Hola Mundo!</TITLE></HEAD>");
    		 out.println("<BODY>");
    		 String nombre = (String) request.getParameter("nombre");
    		 if (nombre != null) {
    		 out.println("Hola " + nombre + "<br>");
    		 }
    		 out.println("</BODY></HTML>");
    		}
    		 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
