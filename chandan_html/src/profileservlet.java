

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class profileservlet
 */
@WebServlet("/profileservlet")
public class profileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profileservlet() {
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
	        if(ck!=null)
	        {
	        	String name=ck[0].getValue();
	        	 if(!name.equals("")||name!=null){  
	        		 request.getRequestDispatcher("Login.html").include(request, response); 
	                 pw.print("<b>Welcome to Profile</b>");  
	                 pw.print("<br>Welcome, "+name);  
	                
	             }  
	             }else{  
	                 pw.print("Please login first");  
	                 request.getRequestDispatcher("login.html").include(request, response);  
	             }  
	        	
	        }


		
		
		
		
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
