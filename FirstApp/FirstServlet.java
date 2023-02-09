import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet
{
	
	static {
		System.out.println("First servlet .class file is loading...");
	}
	
	public FirstServlet() {
		System.out.println("First servelet object is instantiated...");
	}
	
	public  void init(ServletConfig config) throws ServletException{
		System.out.println("servlet initialization...");
	}
	
	  public  ServletConfig getServletConfig() {
		  return null;
	  }
	  
	  //request processing logic
	  public  void service(ServletRequest request, ServletResponse response) 
			  throws ServletException, IOException{
		  
		  System.out.println("servlet Request Processing...");
	  }
	  
	  
	  public  String getServletInfo() {
		  return null;
	  }
	  //Servlet Deinstantion logic
	  public  void destroy() {
		  System.out.println("servlet De-instantiation...");
	  }
}