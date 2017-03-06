import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PollPost
 */
@WebServlet("/PollPost")
public class QuickPollSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuickPollSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String q = request.getParameter("question");
	    ServletContext c = getServletContext();
	    c.setAttribute("question", "What sport do you prefer");
	    c.setAttribute("yes", new Integer(0));
	    c.setAttribute("no", new Integer(0));
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    response.sendRedirect("http://localhost:8080/VoteWA/ask");
	    /*out.print("<html><head><title>QuickPoll</title></head><body>"+
	              "<h1>QuickPoll</h1>"+
	              "Your question has been registered. "+
	              "Let the vote begin!"+
	              "</body></html>");
		*/
		// TODO Auto-generated method stub
	}

}