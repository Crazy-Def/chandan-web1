package com.common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BLManager;
import com.pojo.Hiber;

/**
 * Servlet implementation class saveservlet
 */
@WebServlet("/saveservlet")
public class saveservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BLManager bl=new BLManager();
	Hiber hb=new Hiber();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public saveservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		hb.setName(name);
		hb.setPassword(password);
		hb.setEmail(email);
		bl.savedata(hb);
		response.sendRedirect("index.jsp");
		
		
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
