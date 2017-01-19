

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterservletFilter
 */
@WebFilter(servletNames = { "Filterservlet" })
public class FilterservletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FilterservletFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		if(name.equals(""))
		{
			pw.print("Enter your name first");
		}
		else if(pass.equals(""))
		{
			pw.print("Enter your password");
			
		}
		else if(pass.equals("crazy"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			pw.print("password is wrong plz login again");
			request.getRequestDispatcher("Filterlogin.html").include(request, response);
		}
		//pw.print("<form>");
		pw.print("<div>");
		
		pw.print("YOOOOOOOOO");
		
		pw.print("</div>");
	//	pw.print("</div>");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
