

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Editservlet
 */
@WebServlet("/Editservlet")
public class Editservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editservlet() {
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
		pw.print("<h1>Update Employees</h1>");
		String s=request.getParameter("id");
		int id=Integer.parseInt(s);
		System.out.println(id);
		Emp e=EmpDao.getEmployeeById(id);
		pw.print("<form action='Editservlet2' method='post'>");  
        pw.print("<table>");  
        pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        pw.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");  
        pw.print("<tr><td>Password:</td><td><input type='text' name='password' value='"+e.getPassword()+"'/></td></tr>");  
        pw.print("<tr><td>Email:</td><td><input type='text' name='email' value='"+e.getEmail()+"'/></td></tr>");  
        pw.print("<tr><td>Country:</td><td>");  
        pw.print("<select name='country' style='width:150px'>");  
        pw.print("<option>India</option>");  
        pw.print("<option>USA</option>");  
        pw.print("<option>Germany</option>");  
        pw.print("<option>France</option>");  
        pw.print("</select>");  
        pw.print("</td></tr>");  
        pw.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        pw.print("</table>");  
        pw.print("</form>");  
          
        pw.close();  
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
