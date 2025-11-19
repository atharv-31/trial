package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name= request.getParameter("uname");
		
		out.print("<h1>"+name+"</h1>");
		
		//How to create Cookie
		
		Cookie cookie=new Cookie("ckid",name);
		response.addCookie(cookie);
		out.print("<br>");
		out.print("<h1>");
		out.print("<a href='SecondServlet'>"+"VISIT"+"</a>");
		out.print("</h1>");
	}

}
