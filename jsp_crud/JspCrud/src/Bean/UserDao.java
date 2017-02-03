package Bean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.catalina.User;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;


public class UserDao {

	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		return con;
	}
	
	
		public static int save(Getter_Setter e)
		{
			int status=0;
			try
			{
				if(e.getName()!=null && e.getPassword()!=null && e.getEmail()!=null)
				{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("insert into crud(name,password,email) values(?,?,?)");
				ps.setString(1, e.getName());
				ps.setString(2, e.getPassword());
				ps.setString(3, e.getEmail());
				status=ps.executeUpdate();
				}
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			return status;
		}
		public static List<Getter_Setter>getAllEmployess()
		{
			List<Getter_Setter> list=new ArrayList<Getter_Setter>(); 
			try
			{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("select * from crud");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					Getter_Setter e=new Getter_Setter();
					e.setName(rs.getString(1));
					e.setPassword(rs.getString(2));
					e.setEmail(rs.getString(3));
					list.add(e);
					
				}
			}
			catch(Exception exxx)
			{
				System.out.println(exxx);
			}
			return list;
		}
		public static Getter_Setter getRecordbyName(String name)
		{
			Getter_Setter e=null;
			try
			{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("select * from crud where name=?");
				ps.setString(1, name);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					e=new Getter_Setter();
					e.setName(rs.getString("name"));
					e.setPassword(rs.getString("password"));
					e.setEmail(rs.getString("email"));
					
					
				}
				
			}
			catch(Exception exxxx)
			{
				System.out.println(exxxx);
			}
			return e;
		}
		public static int update(Getter_Setter e)
		{
			int status=0;
			try
			{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement("update crud set password=?,email=? where name=?");
				
				ps.setString(1, e.getPassword());
				ps.setString(2, e.getEmail());
				ps.setString(3,	e.getName());
				status=ps.executeUpdate();
			}catch(Exception exxxxx)
			{
				System.out.println(exxxxx);
			}
			return status;
		}
		public static void Delete(String n)
		{
			
			try
			{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement(" delete from crud where name=?");
				ps.setString(1,n);
				ps.executeUpdate();
				con.close();
			}
			catch(Exception eyy)
			{
				System.out.println(eyy);
			}
		}
		
	}


