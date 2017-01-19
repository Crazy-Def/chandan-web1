import java.sql.*;
import java.util.Scanner;
public class jdbc_1
{
	public static void main(String[] args) throws Exception 
	{
		/*String name="jdbc:mysql://localhost:3306/chandan";
		String id="";
		String pass="";
		*/
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandan","root","");
		con.setAutoCommit(false);
		PreparedStatement st=con.prepareStatement("insert into student values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("enter the table contents in format 1.name 2.age 3.roll 4.phno 5.id");
		String a=sc.nextLine();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		st.setString(1, a);
		st.setInt(2, b);
		st.setInt(3, c);
		st.setInt(4, d);
		st.setInt(5, e);
		//System.out.println("k");
		//st.executeUpdate("insert into student  values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"')");
		st.addBatch();
		System.out.println("do you want to continue");
		String ans=sc.nextLine();
		if(ans.equals("n"))
		{
			break;
		}
		//System.out.println("do you want to enter another name ?");
		}
		st.executeBatch();

		ResultSet rs1=st.executeQuery("select * from student");
		while(rs1.next()) 
		{
		 System.out.println(" "+rs1.getString(1)+ " "+rs1.getInt(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4)+" "+rs1.getInt(5)+" ");	
		}
		con.close();
		
		
	}

}
