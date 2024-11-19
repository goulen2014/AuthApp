package com.eimi.authentication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String name = req.getParameter("name");
			String pwd = req.getParameter("pwd");
			//content type
			res.setContentType("text/html");
			//printwriter object
			PrintWriter pw = res.getWriter();
			
			if(name.equals("David") && pwd.equals("david")) {
				HttpSession hs = req.getSession();
				hs.setAttribute("uname", name);
				res.sendRedirect("success.jsp");
			}
			else {
				pw.println("<h1 style='color:red'>Sorry! Username or Password is incorrect!</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("logIn.jsp");
				rd.include(req, res);
			}
		}
}
