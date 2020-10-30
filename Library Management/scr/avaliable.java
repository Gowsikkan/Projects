/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gowsikkan Smart
 */
public class avaliable {
    
 public static int baval(int lcode) {
                              int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select lcode from book where lcode=?");
                        ps.setInt(1,lcode);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        status=rs.getInt(1);
                        }
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status; 
        
    }
    
 public static int caval(int lcode) {
                              int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select lcode from cd where lcode=?");
                        ps.setInt(1,lcode);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        status=rs.getInt(1);
                        }
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status; 
        
    }
 
 public static int maval(int lcode) {
                              int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select lcode from magazine where lcode=?");
                        ps.setInt(1,lcode);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        status=rs.getInt(1);
                        }
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status; 
        
    }
 public static int javal(int lcode) {
                              int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select lcode FROM journal where lcode=?");
                        ps.setInt(1,lcode);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        status=rs.getInt(1);
                        }
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status; 
        
    }
}
