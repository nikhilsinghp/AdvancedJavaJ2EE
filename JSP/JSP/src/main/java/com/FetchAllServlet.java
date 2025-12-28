package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getAll")
public class FetchAllServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		Employee e1 = new Employee(1,"tom", "developer",15000);
		Employee e2 = new Employee(2,"jerry", "tester",10000);
		Employee e3 = new Employee(3,"john", "sweeper",10000);
		Employee e4 = new Employee(4,"drew", "manager",30000);
		Employee e5 = new Employee(5,"seth", "developer",15000);
		
		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		a1.add(e5);
		
		req.setAttribute("list", a1);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("getAll.jsp");
		dispatcher.forward(req, res);
	}
}
		
