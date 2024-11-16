package com.eimi.authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final String query = "insert into USERS(name, email, pwd) values(?,?,?)";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//PrintWriter object
		PrintWriter pw = res.getWriter();  
		//set content type
		res.setContentType("text/html");   
		//bootstrap
		pw.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css'>");
		
		//get user inputs
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String repeatpwd = req.getParameter("repeatpwd");
		
		//validate inputs
		if(name==null || email==null || pwd==null || repeatpwd==null || !pwd.equals(repeatpwd)) {
			pw.println("<h1 class='text-danger'>Invalid input or passwords do not match.</h1>");
			pw.println("<a href='signUp.jsp'><button class='btn btn-outline-warning'>Go Back</button></a>");
			return;
		}
		
		//load JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//database credentials
		String dburl = "jdbc:mysql:///AuthApp";
		String dbuser = "root";
		String dbpwd = "";
		
		//database operation
		try(Connection con = DriverManager.getConnection("jdbc:mysql:///AuthApp", dbuser, dbpwd);
				PreparedStatement ps = con.prepareStatement(query);) {
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pwd);
			int count = ps.executeUpdate();
			
			if(count>0) {
				pw.println("<h1 class='text-success'>Successfully signed up!</h1>");
			} else {
				pw.println("<h1 class='text-danger'>Sign up not successful!</h1>");
			}
			
		} catch (SQLException se) {
			pw.println(se.getMessage());
			se.printStackTrace();
		} catch (Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}
//		pw.println("</br>");
		pw.println("<a href='signUp.jsp'><button class='btn btn-outline-success'>Go Back</button></a>");
		
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
