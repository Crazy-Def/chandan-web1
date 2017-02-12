package com.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.BLManager;
import com.pojo.Hiber;

/**
 * Servlet implementation class updateemp
 */
@WebServlet("/updateemp")
public class updateemp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateemp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String id=request.getParameter("id");
		int sid=Integer.parseInt(id);
		BLManager bl=new BLManager();
		Hiber h=bl.serachid(sid);
		HttpSession session=request.getSession();
		session.setAttribute("h", h);
		response.sendRedirect("update.jsp");
		
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		int sid=Integer.parseInt(id);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		BLManager bl=new BLManager();
		Hiber h=new Hiber();
		h.setId(sid);
		h.setName(name);
		h.setPassword(password);
		h.setEmail(email);
		bl.updateempp(h);
		List<Hiber> list=bl.getemp();
		HttpSession session=request.getSession();
		session.setAttribute("list2", list);
		response.sendRedirect("viewdata.jsp");
		
		
		
		
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
