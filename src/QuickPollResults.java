import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuickPollResults extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
  {
    ServletContext c = getServletContext();
    String question = (String)c.getAttribute("question");
    int yes = ((Integer)c.getAttribute("yes")).intValue();
    int no = ((Integer)c.getAttribute("no")).intValue();
    int total = yes+no;
    response.setContentType("text/html");
    response.setDateHeader("Expires", 0);
    response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    PrintWriter out = response.getWriter();
    out.print("<html><head><title>QuickPoll</title></head><body>"+"<h1>QuickPoll</h1>");
    if (total==0)
      out.print("No votes yet...");
    else 
    {
      out.print(
        "What sport do you prefer" + "?<p>"+
        "<table border=0>"+
        "<tr><td>Basketball:<td>"+drawBar(300*yes/total)+"<td>"+(float)yes/total*100+"%"+
        "<tr><td>Football:<td>"+drawBar(300*no/total)+"<td>"+(float)no/total*100+"%"+
        "</table>"); 
    }
    out.print("</body></html>");
  }

  String drawBar(int length) 
  {
    return "<table><tr><td bgcolor=black height=20 width="+ length+"></table>";
  }
}