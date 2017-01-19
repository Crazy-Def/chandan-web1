

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookies_servlet
 */
@WebServlet("/Cookies_servlet")
public class Cookies_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookies_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
        Cookie ck[]=request.getCookies();  
        String ss="";
        for(Cookie c:ck)
        {
        if(c.getName().equals("q"))	
        {
        	ss=c.getValue();
		String e=request.getParameter("c3");
		double f=Double.parseDouble(e);
		String g=request.getParameter("c4");
		double h=Double.parseDouble(g);
		double result=f*h;
		pw.write("multiplictaion of " +f+ " and " +h+" is " +result+ " ");
		Cookie ck1=new Cookie("c3",e);
		response.addCookie(ck1);
		Cookie ck2=new Cookie("c4",g);
		response.addCookie(ck2);
		pw.write("<br>");
		pw.write("Do you also want to perform addition of those no's : ? " );
		pw.write("<br>");
		pw.write("<form action='Cookies_servlet1'>");
		pw.write("<input type='submit' value='add'>" );
		//pw.write("<form action='Cookies_servlet1'>");
		pw.write("</form>");
		pw.close();
           }
        else{  
            pw.print("Please login first");  
            request.getRequestDispatcher("Login.html").include(request, response); 
        }
        }
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
