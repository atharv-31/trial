package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StudentDAO;
import dao.StudentDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;


@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public StudentUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		float marks=Float.parseFloat(request.getParameter("marks"));
		
		Student student= new Student (id,name,marks); 
		
		StudentDAO dao=new StudentDAOImpl();
		
		int count=dao.updateStudent(student);
		
		if(count > 0)
		    out.print("<h1>Success</h1>");
		else
		    out.print("<h1>Fail To update</h1>");

}
}