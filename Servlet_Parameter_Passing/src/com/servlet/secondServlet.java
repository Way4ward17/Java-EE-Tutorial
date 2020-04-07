package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class secondServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//All methods to catch request from client
		
		
		
		//DISPATCHER CATCHER
		//int sum = (int) req.getAttribute("sum");
		
		
		//SEND URLREDIRECT CATCHER
		//int sum = Integer.parseInt(req.getParameter("sum"));
		
		//SESSION CATCHER
		//HttpSession session = req.getSession();
		//int sum = (int) session.getAttribute("sum");
		//session.removeAttribute("sum");
		
		
		
		//CATCH COOKIE
		int sum = 0;
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		PrintWriter writer = res.getWriter();
		writer.println("Result is: "+sum);
	}

}
