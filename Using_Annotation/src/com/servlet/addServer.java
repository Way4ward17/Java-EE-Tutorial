package com.servlet;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firstServlet")
public class addServer extends HttpServlet{
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a + b;
		
		//REQUEST DISPATCHER
//		req.setAttribute("sum", sum);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("secondServlet");
//		dispatcher.forward(req, res);
//		
		
		
//		SESSION MANAGEMENT
		//HttpSession session = req.getSession();
		//session.setAttribute("sum", sum);
		//res.sendRedirect("secondServlet");
		
		
		//COOKIES
		Cookie cookie = new Cookie("sum", sum+"");
		res.addCookie(cookie);
		res.sendRedirect("secondServlet");
	
		//URL REDIRECTING
		//res.sendRedirect("secondServlet?sum="+sum);
		
	}

}
