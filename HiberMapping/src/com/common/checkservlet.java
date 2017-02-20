package com.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Role;
import com.pojo.Student;

/**
 * Servlet implementation class checkservlet
 */
@WebServlet("/checkservlet")
public class checkservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		String rolename=request.getParameter("rolename");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		BLManager bl=new BLManager();
		Student s=new Student();
		Role r=new Role();
		Student s1=bl.checkdata(email,password);
		if(s1.getEmail().equals(email) && s1.getPassword().equals(password))
		{
			if(rolename.equals("admin"))
			{
				response.sendRedirect("admin.jsp?name="+name+"");
			}
			else if(rolename.equals("teacher"))
			{
				PrintWriter out=response.getWriter();
				out.print("hello");
			}
			else
			{
				response.sendRedirect("hod.jsp?name="+name+"");
			}
			
			
		}
		
		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
