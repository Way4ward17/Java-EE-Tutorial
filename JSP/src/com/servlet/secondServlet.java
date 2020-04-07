package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class secondServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	

		int sum = (int) req.getAttribute("sum");
		
		PrintWriter writer = res.getWriter();
		writer.println("Result is: "+sum);
	}

}
