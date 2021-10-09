/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yogesh
 */
public class DisplayData extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        String id=req.getParameter("eid");
        PrintWriter out=res.getWriter();
        
        try
        {
            Connection con=Database.connect();
            PreparedStatement st = con.prepareStatement("select * from employee");
            ResultSet rs=st.executeQuery();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1 style='color:red; text-align:center;'>Employee Details</h1>");
            out.println("<table style='margin-left:auto;margin-right:auto;' border=1 width=50% height=50%>");
            out.println("<tr><th>EmpID</th><th>EmpName</th><th>EmpDesignation</th><th>JoiningDate</th><th>EmpSalary</th>");
            while(rs.next())
            {
                int empID=rs.getInt(1);
                String empName=rs.getString(2);
                String empDesg=rs.getString(3);
                String empJoin=rs.getString(4);
                int empSalary=rs.getInt(5);
                out.println("<tr><td>" + empID + "</td><td>" + empName + "</td><td>" + empDesg + "</td><td>" + empJoin + "</td><td>" + empSalary + "</td><tr>");   
                
            }
            
            out.println("</table>");
            out.println("</body>");
            out.println("<p><a href=\"index.html\">Return" + 
                     "</a> to main page</p>");   
            out.println("</html");
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
