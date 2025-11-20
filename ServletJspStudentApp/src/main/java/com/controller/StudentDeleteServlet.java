package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.model.Student;

@WebServlet("/StudentDeleteServlet")
public class StudentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentDeleteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int id = Integer.parseInt(request.getParameter("id"));

		StudentDAO dao = new StudentDAOImpl();

		int count = dao.deleteStudent(id);

		if (count > 0) {
			out.print("<h1> Student Delete </h1>");
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.include(request, response);

		}
		else
			out.print("<h1> FAIL </h1>");

	}

}