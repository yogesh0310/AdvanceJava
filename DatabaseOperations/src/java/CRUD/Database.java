/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

/**
 *
 * @author Yogesh
 */
import java.sql.*;
import java.lang.*;
import java.util.*;
/**
 *
 * @author Yogesh
 */
public class Database{
    
    protected static Connection connect() throws Exception
    {
        String jdbcDriver="com.mysql.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/advancejava?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String dbName="advancejava";
        String username="root";
        String password="";
        Class.forName(jdbcDriver);
        Connection con=DriverManager.getConnection(dbURL,username,password);
        
        
        return con;
    }
    
}
