
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * @author Yogesh
 */
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        String principalAmount=req.getParameter("amount");
        String noOfYears=req.getParameter("noOfYears");
        String interest=req.getParameter("rate");
        String fName=req.getParameter("fname");
        String lName=req.getParameter("lname");
        float amount=Float.parseFloat(principalAmount);
        int years=Integer.parseInt(noOfYears);
        float rate=Float.parseFloat(interest);
        float totalInterest=0.0f;
        totalInterest=totalInterest+amount*rate/100;
        float totalAmount=totalInterest+amount;
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Calculated Interest</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1 align='center'> Hello "+fName+" "+lName+"</h1>");
        pw.println("<h3 style='color:red; text-align:center;'> The Interest for "+amount+"/- is "+totalInterest+"</h1>");
        pw.println("<h3 style='color:red; text-align:center;'> Total amount is: "+totalAmount+"</h3>");
        pw.println("</body>");
        pw.println("</html>");
        
    }

   

}
