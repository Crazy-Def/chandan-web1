import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;




public class jdbc_retrieve_image
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandan","root","");
		PreparedStatement ps=con.prepareStatement("select * from images");
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			Blob b=rs.getBlob(1);
			byte[] barr=b.getBytes(1,(int) b.length());	
			FileOutputStream f= new FileOutputStream("C:\\Users\\SIF 3887\\Desktop\\c.jpg");
			f.write(barr);
			//System.out.println("k");
			f.close();
			con.close();
		}
		
	}
}
