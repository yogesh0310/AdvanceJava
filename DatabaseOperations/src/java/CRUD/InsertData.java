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
import CRUD.Database;
/**
 *
 * @author Yogesh
 */
public class InsertData extends HttpServlet {

    @Override
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        String id=req.getParameter("eid");
        PrintWriter out=res.getWriter();
        
        try
        {
            Connection con=Database.connect();
            PreparedStatement st = con.prepareStatement("insert into employee values(?,?,?,?,?)");
            st.setInt(1,Integer.valueOf(req.getParameter("eid")));
            st.setString(2,req.getParameter("ename"));
            st.setString(3,req.getParameter("desg"));
            st.setString(4,req.getParameter("jdate"));
            st.setInt(5,Integer.valueOf(req.getParameter("salary")));
            st.executeUpdate();
            out.println("<html>");
            out.println("<body>");
            out.println("<h1 style='margin-left:auto;margin-right:auto;'>Successfully Inserted</h1>");
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
