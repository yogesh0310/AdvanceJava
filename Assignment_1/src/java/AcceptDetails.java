import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class AcceptDetails extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

// Set response content type
response.setContentType("text/html");

PrintWriter out = response.getWriter();
String title = "User details";
String docType =
"<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

out.println(docType +
"<html>\n" +
"<head><style> ul{ text-align:center; list-style-type:none; font-size:30px;}</style><title>" + title + "</title></head>\n" +
"<body bgcolor = \"cyan\">\n" +
"<h1 align = \"center\">" + title + "</h1>\n" +
"<ul >\n" +
"  <li><b>First Name</b>: "
+ request.getParameter("first_name") + "\n" +
"  <li><b>Last Name</b>: "
+ request.getParameter("last_name") + "\n" +
"  <li><b>Department</b>: "
+ request.getParameter("Dept") + "\n" +
"  <li><b>Division</b>: "
+ request.getParameter("division") + "\n" +
"  <li><b>Roll No</b>: "
+ request.getParameter("roll") + "\n" +
"</ul>\n" +
"</body>" +
"</html>");
}
}
