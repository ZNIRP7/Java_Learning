import java.sql.*;
import java.util.*;

class InsertDBconnection{
  public static void insertdb()
   {
	   String url = "jdbc:mysql://localhost:3306/BALA";
	   String username = "root";
	   String password = "";
	   Scanner in = new Scanner(System.in);
	   System.out.println("Pls Enter UR ID");
         Integer id =in.nextInt();    
          
       System.out.println("Enter the Passenger Name");
          String passName = in.next(); 
         
       System.out.println("Enter the age of Passenger"); 
           Integer age= in.nextInt();
          
       System.out.println("Kindly give ur PASSWORD"); 
           String passWord= in.next();
         
       System.out.println("Gender like as 'M' or 'F' ");
			char gender = in.next().charAt(0);
			
			//String sql = "insert into customer values('" + name + "'," + roll + ",'" + cls + "')";
			String sql = "insert into customer values("+id +",'" + passName + "',"+ age +",'"+ passWord +"','"+ gender+ "')";
			//String sql = "insert into customer (id, passName,age,passWord,gender)" +values('"+id +"'," + passName + ",' "+ gender+"')";
			
			
	   try {
		   //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BALA","root","");
		   Connection con = DriverManager.getConnection(url,username,password);
		   System.out.println("Success...");
		   Statement st = con.createStatement();
		   
		   int m = st.executeUpdate(sql);
		   if(m==1)
				System.out.println("inserted successfully: "+sql);
			else
			    System.out.println("Not inserted:"+ sql);	
			    con.close();
		   
	       }
	     catch(Exception e){
			     System.out.println(e);}

   }
}

