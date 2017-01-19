

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Id
 */
@WebServlet("/Id")
public class Id extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Id() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String n=request.getParameter("name");
		String a=request.getParameter("address");
		String p=request.getParameter("phno");
		String i=request.getParameter("id");
		String c=request.getParameter("pincode");
		writer.print(n+" ");
		writer.print(a+" ");
		writer.print(p+" ");
		writer.print(i+" ");
		writer.print(c+" ");
		if(n.equals("c"))
		{
			System.out.println("welcome");
			RequestDispatcher rd=request.getRequestDispatcher("Id2");
			rd.forward(request, response);
		}
		else
		{
			writer.print("Wrong UserName");
			RequestDispatcher rd=request.getRequestDispatcher("html_id.html");
			rd.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
