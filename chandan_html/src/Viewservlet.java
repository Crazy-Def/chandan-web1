

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewservlet
 */
@WebServlet("/Viewservlet")
public class Viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewservlet() {
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
		pw.print("<a href='Crudindex.html'>Add New Employess</a>");
		pw.print("<h1>Employees List</h1>");
		List<Emp> list=EmpDao.getAllEmployees();
		pw.print("<table border='5' width='10%'>");
		pw.print("<tr><th> Id </th><th> Name </th><th> Password </th><th> Email </th><th> Country </th><th> Edit </th><th> Delete </th></tr>");
		for(Emp e:list)
		{
			pw.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='Editservlet?id="+e.getId()+"'>Edit</a></td><td><a href='Deleteservlet?id="+e.getId()+"'>Delete</td></tr>");
		}
		pw.print("</table>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}
