import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuickPollVote extends HttpServlet 
{
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
  {
    String vote = request.getParameter("vote");
    ServletContext c = getServletContext();
    if (vote.equals("yes")) 
    {
      int yes = ((Integer)c.getAttribute("yes")).intValue();
      yes++;
      c.setAttribute("yes", new Integer(yes));
    } 
    else if (vote.equals("no")) 
    {
      int no = ((Integer)c.getAttribute("no")).intValue();
      no++;
      c.setAttribute("no", new Integer(no));
    }
    PrintWriter out = response.getWriter();
    response.setContentType("text/html");
    response.sendRedirect("http://localhost:8080/VoteWA/results");
  }
}	