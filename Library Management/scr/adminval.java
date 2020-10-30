/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author Gowsikkan Smart
 */
public class adminval {
    public static int returnval(){
        String name=UserVal.n;
        String pass=UserVal.p;
        
       return 0; 
    }
    public static int addbook(int isbn ,String name,String author,int quantity)
    {
        int status=0;
   
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1,isbn);
			ps.setString(2,name);
			ps.setString(3,author);
                        ps.setInt(4,quantity);
                        status=ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    
    }
    public static int addcd(int lcode ,String name,int year, int quantity)
    {
        int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into cd values(?,?,?,?)");
			ps.setInt(1,lcode);
			ps.setString(2,name);
			ps.setInt(3,year);
                         ps.setInt(4,quantity);
                        status=ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
    
   public static int addmag(int lcode ,String name,int month,int quantity )
    {
            int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into magazine values(?,?,?,?)");
			ps.setInt(1,lcode);
			ps.setString(2,name);
			ps.setInt(3,month);
                         ps.setInt(4,quantity);
                        status =ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
    public static int addjor(int lcode ,String name,int year ,int quantity)
    {
        int status=0;
   
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into journal values(?,?,?,?)");
			ps.setInt(1,lcode);
			ps.setString(2,name);
			ps.setInt(3,year);
                        ps.setInt(4,quantity);
                        status=ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
   public static int delbook(int isbn)
    {
               int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("DELETE FROM book WHERE lcode=?");
			ps.setInt(1,isbn);
			
                       status= ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
      public static int delcd(int lcode)
    {
               int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("DELETE FROM cd WHERE lcode=?");
			ps.setInt(1,lcode);
			
                       status= ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
public static int delmag(int lcode)
    {
               int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("DELETE FROM magazine WHERE lcode=?");
			ps.setInt(1,lcode);
			
                       status= ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }
public static int deljor(int lcode)
    {
               int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("DELETE FROM journal WHERE lcode=?");
			ps.setInt(1,lcode);
			status= ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
    }

    
     
}
