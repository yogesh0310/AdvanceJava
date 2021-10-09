import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginPage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String login = request.getParameter("login");  
        String pass = request.getParameter("pass");
        if(login.equals("Yogesh") && pass.equals("yogesh123"))
            out.println("<h3 style='color:red;'>Login Successful!</h3>");
        else
            out.println("<h3 style='color:red;'>Login FAILED!</h3>");
    }
}