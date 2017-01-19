import java.io.FileInputStream;
import java.sql.*;
public class jdbc_image 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandan","root","");
		PreparedStatement ps=con.prepareStatement("insert into images values (?) ");
		//ps.setString(1,"chandan");
		FileInputStream f=new FileInputStream("C:\\Users\\SIF 3887\\Desktop\\New folder\\Desert.jpg");
		ps.setBinaryStream(1, f, f.available());
		int i=ps.executeUpdate();
		System.out.println(i+ " records affected");
		con.close();
	}
}
