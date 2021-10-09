/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Yogesh
 */
public class UpdateData extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        String id=req.getParameter("eid");
        PrintWriter out=res.getWriter();
        
        try
        {
            Connection con=Database.connect();
            PreparedStatement st = con.prepareStatement("update employee set EmpDesg=?,EmpSalary=? where EmpId=?");
            st.setString(1,req.getParameter("desg"));
            st.setString(2,req.getParameter("salary"));
            st.setInt(3,Integer.valueOf(req.getParameter("eid")));
            st.executeUpdate();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Successfully Updated</h1>");
            out.println("</body>");
            out.println("</html");
            out.println("<p><a href=\"index.html\">Return" + 
                     "</a> to main page</p>");   
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
