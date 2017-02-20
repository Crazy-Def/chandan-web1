package com.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Role;
import com.pojo.Student;

/**
 * Servlet implementation class saveservlet
 */
@WebServlet("/saveservlet")
public class saveservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public saveservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String rolename = request.getParameter("rolename");
		String sname = request.getParameter("sname");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		Role r = new Role();
		Student t = new Student();
		BLManager bl = new BLManager();
		t.setSname(sname);
		t.setAge(age);
		r = bl.searchdata(rolename);
		t.setRole(r);
		t.setEmail(email);
		t.setPassword(pass);
		int b=bl.getdata(email);
		if(b<1)
		{
			bl.savedata(t);

		}
		else
		{
			out.print("< Give different passowrd>");
		}
		// TODO Auto-generated method stub
	}

}
