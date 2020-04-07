package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
	PrintWriter writer = res.getWriter();
	ServletContext context = getServletContext();
	String name = context.getInitParameter("Name");
	String phone = context.getInitParameter("Phone");
	writer.println(name + " "+phone);
	
	
	ServletConfig config = getServletConfig();
	String name1 = config.getInitParameter("Name");
	String phone1 = config.getInitParameter("Phone");
	
	
	writer.println(name1 + " "+phone1);
	}

}
