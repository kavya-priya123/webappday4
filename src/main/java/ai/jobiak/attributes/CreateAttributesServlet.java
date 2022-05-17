package ai.jobiak.attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAttributesServlet
 */
@WebServlet("/attributes")
public class CreateAttributesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAttributesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();//.append("Served at: ").append(request.getContextPath());
		ServletContext context=getServletContext();
		context.setAttribute("dbName","mySQL");
	    context.setAttribute("dbVersion","8.0.28");	
	    
	    request.setAttribute("jdk","17.01");
	    request.setAttribute("os","Windows 10");//3
	    
	    RequestDispatcher dispatcher=context.getRequestDispatcher("/readAttributes");
	    dispatcher.forward(request, response);   //deligating //dispatching the servlets(2)
	    
	}

}
