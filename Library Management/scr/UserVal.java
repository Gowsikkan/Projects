   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmss; 


import java.sql.*;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Gowsikkan Smart
 */
public class UserVal {
   static String n,p,c;
   static int id;
        public static boolean signin(String name,String password) 
        {
        boolean status=false;
        try{
        String url="jdbc:mysql://localhost:3306/db";
        String uname="root";
        String upass="Gowsikkan@13";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,uname,upass);
        PreparedStatement ps=con.prepareStatement("select * from userdetials where name=? and password=? and category=?");
			ps.setString(1,name);
			ps.setString(2,password);
                        ps.setString(3,c);
                        ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
        
        public static int save(String name,String password,String email,String address,String contact){
		int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into userdetials(category,name,email,address,contact,password) values(?,?,?,?,?,?)");
			ps.setString(1, c);
                        ps.setString(2,name);
                        ps.setString(3,email);
                        ps.setString(4,address);
                        ps.setString(5,contact);
                        ps.setString(6,password);
       			status=ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                        
                    }
                    return status; 
        }
                    public static int det(String name,String password)
                    {
                     if(name.equals("")&&password.equals(""))
                     {
                        
                     }
                     else{
                          n=name;
                           p=password;
                           
                     }
                        return 0;
                    }
                    public static int det1(String name,String password)
                    {
                     if(name.equals("")&&password.equals(""))
                     {
                         
                     }
                     else{
                           n=name;
                           p=password;
                           
                           
                          
                     }
                        return 0;
                    }
                    
                    public static int e(int code)
                            
                    {
                        System.out.println(code);
                        UserVal.issued(code);
                    return 0;
                    }
                    
                    public static int validate()
                    {
                            int c=UserVal.check(n,p);
                         
                        return c;
                    
                    }
                    public static String idd()
                    {
                            int b=UserVal.id();
                            id=b;
                            
                    return c;
                    }
                    
                    public static int id()
                    {
                        int status=0;
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select id from userdetials where name=? and password=?");
                        ps.setString(1,n);
                        ps.setString(2,p);
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
                    
 public static int issued(int code)
  {
         
                        int status=0;
                        long millis=System.currentTimeMillis();  
                        java.sql.Date date=new java.sql.Date(millis);  
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("insert into issue values(?,?,?,?,?)");
                       ps.setInt(1, id);
                        ps.setString(2,c);
                        ps.setString(3,n);
                        ps.setInt(4,code);
                        ps.setDate(5,date);
                       
                        
			status=ps.executeUpdate();
			con.close();
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status; 
                    }
	public static int returnd(int lcode)
        {
        
              int daysdiff =0;
                        long millis=System.currentTimeMillis();  
                        java.sql.Date date=new java.sql.Date(millis);  
                        java.sql.Date e = null;
                                               
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select issuedate from issue where id='" + id + "'  and issuecode='" + lcode + "'");
                        ResultSet rs=ps.executeQuery();
                    
                        while(rs.next()){
                            e=rs.getDate(1);
                            
                        }
                        
                    con.close();
                 
                    
                   
                long diff = date.getTime() - e.getTime();
                 long diffDays = diff / (24 * 60 * 60 * 1000) ;
                daysdiff = (int) diffDays;

                    }catch(Exception ye){
                        return 0;
                    }
               
                try{
                         int status=0;
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                       PreparedStatement ps=con.prepareStatement("delete from issue where issuecode=? and id=?");
			ps.setInt(1,lcode);
			ps.setInt(2,id);
			status=ps.executeUpdate();
			
                    con.close();
               

                    }catch(Exception ye){
                        return 0;
                    }
            	try{
                     int status=0;
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        if(lcode>1000 && lcode<3000){
                        PreparedStatement ps=con.prepareStatement("update book set quantity=quantity+1 where lcode=?");
			ps.setInt(1,lcode);
			status=ps.executeUpdate();}
                        else if(lcode>3000 && lcode<5000){
                        PreparedStatement ps=con.prepareStatement("update cd set quantity=quantity+1 where lcode=?");
			ps.setInt(1,lcode);
			status=ps.executeUpdate();}
                        if(lcode>5000 && lcode<7000){
                        PreparedStatement ps=con.prepareStatement("update magazine set quantity=quantity+1 where lcode=?");
			ps.setInt(1,lcode);
			status=ps.executeUpdate();}
                        if(lcode>7000 && lcode<9999){
                        PreparedStatement ps=con.prepareStatement("update journal set quantity=quantity+1 where lcode=?");
			ps.setInt(1,lcode);
			status=ps.executeUpdate();}
                        
                        con.close();
               

                    }catch(Exception ye){
                        System.out.println(ye);
                    }
            	
               
            return daysdiff ;
        }
        
 public static int check(String name,String password)
  {
         
                      int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/sys";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("select issuecode from userdetials where name='" + name + "' and password='" + password + "'");
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
        
                    
 
 
                    public static String aa()
                    {
                        return c;
                    }
                    public static void cat(String k){
                        c=k;
                    }
                    public static int al()
                    {
                                          int status=0;
                        
                         
		try{
                        String url="jdbc:mysql://localhost:3306/db";
                        String uname="root";
                        String upass="Gowsikkan@13";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con= DriverManager.getConnection(url,uname,upass);
                        PreparedStatement ps=con.prepareStatement("SELECT count(*) from issue where name=?");
                        ps.setString(1,n);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                        status=rs.getInt(1);
                        }
			con.close();
                        System.out.println(status);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return status;
                    }
                    public static int nameset(String name){
                        String n;
                        int i=2;
                        try{
                           String url="jdbc:mysql://localhost:3306/db";
                           String uname="root";
                           String upass="Gowsikkan@13";
                           Class.forName("com.mysql.cj.jdbc.Driver");
                           Connection con= DriverManager.getConnection(url,uname,upass);
                           PreparedStatement ps=con.prepareStatement("select password from userdetials");
                           //ps.setString(1,x);
                           ResultSet rs=ps.executeQuery();
                           /*Statement stt =con.createStatement();
                           ResultSet rs =stt.executeQuery("select TOTAL from bikeprice where SERVICE='" + x + "'");*/
                           Set<String> name_Set = new HashSet<String>();
                           while(rs.next()){
                               n=rs.getString(1);
                               name_Set.add(n);
                           }


                           con.close();

                           if(name_Set.contains(name)){
                               i=0;
                           }
                           else{
                               i=1;
                           }
                         

                           }
                           catch(Exception e){
                                      System.out.println(e);

                           }

                        return i;
                   }


                    public static String issued1()
                    {
                        return n;
                    }
                    
                    public static int issued2()
                    {
                        return id;
                    }
                    public static String issued3()
                    {
                        return c;
                    }
                    
}