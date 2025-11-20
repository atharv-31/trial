package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentAddServlet")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDAO dao;

	public StudentAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {

		dao = new StudentDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float marks = Float.parseFloat(request.getParameter("marks"));

		Student student = new Student(id, name, marks);

		int count = dao.saveStudent(student);

		if (count >= 0) {
			out.print("<h1> SUCCESS </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.include(request, response);
		}

		else
			out.print("<h1> FAIL </h1>");

	}
}