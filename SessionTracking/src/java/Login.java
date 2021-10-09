import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession(true);
        session.setAttribute("uname", uname);
        session.setAttribute("pass", pass);
        if(uname.equals("yogesh") && pass.equals("yogesh")) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Success</title>");            
            out.println("</head>");
            out.println("<body>");
            String newURL = response.encodeURL("GetSession"); 
            out.println("<h1>Thank you " + uname + "</h1>");
            out.println("Click <a href=\"" + newURL 
                    +"\">here</a> for another servlet");
            out.println("</body>");
            out.println("</html>");
        }
        else
            out.println("<h2>Authentication Failed<h2>");
    }
}
