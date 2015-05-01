package com.vassilis.blog.controlers.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BlogServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		super.doGet(req, resp);
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			session.setAttribute("name", "vassilis");
			session.setAttribute("phone", "6946943942");
		}
		
		System.out.println(session.getId());
		
		System.out.println("servlet...");
	}
}