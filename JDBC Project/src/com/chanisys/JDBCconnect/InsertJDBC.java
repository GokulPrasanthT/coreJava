package com.chanisys.JDBCconnect;
import java.io.*;
import java.sql.*;
	public class InsertJDBC {
	    public static void main(String[] args)throws Exception {
	        Class.forName("oracle.jdbc.driver.OracleDriver");  
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
	          
	        PreparedStatement ps=con.prepareStatement("insert into Emp_12 values(?,?,?,?)");  
	          
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	          
	        do
	        {  
	        System.out.println("Enter Emp_id:");  
	        int id=Integer.parseInt(br.readLine());  
//	        System.out.println("Enter Emp_Name:");  
//	        String name=br.readLine();  
//	        System.out.println("Enter Emp_salary:");  
//	        float salary=Float.parseFloat(br.readLine());
//	        System.out.println("Enter Emp_City:");  
//	        String City=br.readLine();  
	          
//	        ps.setInt(1,id);  
//	        ps.setString(2,name);  
//	        ps.setFloat(3,salary); 
//	        ps.setString(4, City);
	        //int i=ps.executeUpdate("delete from Emp_12 where Emp_id = 456");  
	        int e=ps.executeUpdate("update Employees set First_name='GokulSanjay',salary=550000 where Sno=36"); 
	       // System.out.println(i+" records affected");  
	          
	        System.out.println("Do you want to continue:y/n" );  
	        String s=br.readLine();  
	        if(s.startsWith("n"))
	        {  
	        	break;  
	        }  
	        }
	        while(true);  
	          
	        con.close();  
	        }  
	    }


