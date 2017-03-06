import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PollAsk
 */
@WebServlet("/PollAsk")
public class QuickPollAsk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuickPollAsk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.print("<html><head><title>QuickPoll</title></head><body>"+
	              "<h1>QuickPoll</h1>"+
	              "<form method=post action=vote>");
	    out.print("What is your favourite sport"+"?<p>");
	    out.print("<input name=vote type=radio value=yes> Basketball<br>"+
	              "<input name=vote type=radio value=no> Football<p>"+
	              "<input type=submit name=submit value=Vote>"+
	              "</form>"+
	              "</body></html>");
	}

}