package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Employee e = new Employee(1,"tom", "dev",15000);
		req.setAttribute("emp", e);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("get.jsp");
		dispatcher.forward(req, res);
	}

}

