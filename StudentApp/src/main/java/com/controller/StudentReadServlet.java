package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import dao.StudentDAOImpl;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;


@WebServlet("/StudentReadServlet")
public class StudentReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentReadServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		StudentDAO dao = new StudentDAOImpl();
		List<Student> studList = dao.getAllStudents();

		out.print("<html>");
		out.print("<head>");
		out.print("<link rel='stylesheet' href='css/table.css' >");
		out.print("<title>Student List</title>");
		out.print("</head>");

		out.print("<body>");

		out.print("<h2>All Students Information</h2>");

		if (studList == null || studList.isEmpty()) {
			out.print("<p>No student records found.</p>");
		} else {
			out.print("<table border='1' cellpadding='5'>");
			out.print("<tr>");
			out.print("<th>ID</th>");
			out.print("<th>Name</th>");
			out.print("<th>Marks</th>");
			out.print("</tr>");

			for (Student student : studList) {
				out.print("<tr>");
				out.print("<td>" + student.getId() + "</td>");
				out.print("<td>" + student.getName() + "</td>");
				out.print("<td>" + student.getMarks() + "</td>");
				out.print("</tr>");
			}

			out.print("</table>");
		}

		out.print("</body>");
		out.print("</html>");
	}
}