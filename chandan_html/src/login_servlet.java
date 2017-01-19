

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login_servlet
 */
@WebServlet("/login_servlet")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login_servlet() {
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
		String s="";
		String a="";
		int x=0;
		String p=request.getParameter("passw");
		String q=request.getParameter("name");
		Cookie ck[]=request.getCookies();
		if(ck==null)
		{
			request.getRequestDispatcher("login1.html").include(request, response);
			pw.print("plz signup 1st:");
		}
		else
		{
		for(int i=0;i<ck.length;i++)
		{
			if(q.equals(ck[i].getName())&&p.equals(ck[i].getValue()))
			{
				s=ck[i].getName();
				a=ck[i].getValue();
				x=i;
				break;
			}
		}

		if(q.equals(s)&&p.equals(a))
		{
			
			pw.write("U r Sucessfully Logged in");
            pw.print("<br>Welcome, "+s);  

			//Cookie ck=new Cookie(p,q);
			response.addCookie(ck[x]);
			request.getRequestDispatcher("Login.html").include(request, response);
			
			
		}
		else
		{
			pw.print("Wrong username or password");
			RequestDispatcher rd=request.getRequestDispatcher("login1.html");
			rd.include(request, response);

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
