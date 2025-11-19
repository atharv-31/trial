package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		Cookie[] cookies=request.getCookies();
		
		for(Cookie cookie:cookies) {
			out.print("<h2>"+cookie.getName()+"</h2>");
			out.print("<h2>"+cookie.getValue()+"</h2>");
		}
		
		Cookie ck=new Cookie("ckid","");
		ck.setMaxAge(-1);
		response.addCookie(ck);
		
		out.print("<h1> Thank you </h1>");
		
	}

}
