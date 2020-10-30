/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmss;
import java.sql.*;
/**
 *
 * @author Gowsikkan Smart
 */
public class Stock {
    public static boolean book(int isbn,String name,String author){
		boolean status=false;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select * from book where lcode=? and name=? and author=? and quantity !=0");
			ps.setInt(1,isbn);
			ps.setString(2,name);
                        ps.setString(3,author);
			ResultSet rs=ps.executeQuery();
                        status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    public static boolean CD(int lcode,String name,int year){
		boolean status=false;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select * from cd where lcode=? and name=? and year=? and quantity !=0");
			ps.setInt(1,lcode);
                        ps.setString(2,name);
                        ps.setInt(3,year);
			ResultSet rs=ps.executeQuery();
                        status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    public static boolean journal(int lcode,String name,int year){
		boolean status=false;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select * from journal where lcode=? and name=? and year=? and quantity !=0");
			ps.setInt(1,lcode);
                        ps.setString(2,name);
                        ps.setInt(3,year);
			ResultSet rs=ps.executeQuery();
                        status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
     public static boolean mag(int lcode ,String name,int month){
		boolean status=false;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select * from magazine where lcode=? and name=? and month=? and quantity !=0");
			ps.setInt(1, lcode);
                        ps.setString(2,name);
                        ps.setInt(3,month);
			ResultSet rs=ps.executeQuery();
                        status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

public static int updatebook( int bookcallno){
	int status=0;
	int quantity=0,issued=0;
	try{
		
		 String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
		PreparedStatement ps=con.prepareStatement("select quantity from book where lcode=?");
		ps.setInt(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt(1);
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update book set quantity=? where lcode=?");
		ps2.setInt(1,quantity-1);
		
		ps2.setInt(2,bookcallno);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatecd( int bookcallno){
	int status=0;
	int quantity=0,issued=0;
	try{
		
		 String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
		PreparedStatement ps=con.prepareStatement("select quantity from cd where lcode=?");
		ps.setInt(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt(1);
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update cd set quantity=? where lcode=?");
		ps2.setInt(1,quantity-1);
		
		ps2.setInt(2,bookcallno);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatemag( int bookcallno){
	int status=0;
	int quantity=0,issued=0;
	try{
		
		 String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
		PreparedStatement ps=con.prepareStatement("select quantity from magazine where lcode=?");
		ps.setInt(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt(1);
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update magazine set quantity=? where lcode=?");
		ps2.setInt(1,quantity-1);
		
		ps2.setInt(2,bookcallno);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatejor( int bookcallno){
	int status=0;
	int quantity=0,issued=0;
	try{
		
		 String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
		PreparedStatement ps=con.prepareStatement("select quantity from journal where lcode=?");
		ps.setInt(1,bookcallno);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt(1);
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update journal set quantity=? where lcode=?");
		ps2.setInt(1,quantity-1);
		
		ps2.setInt(2,bookcallno);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
    }

