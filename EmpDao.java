import java.util.*;
import java.io.IOException;
import java.sql.*;
public class EmpDao 
{
	public static Connection getConnection()
	{
	Connection con=null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandan","root","");
		System.out.println("A");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	
	
return con;
	
	
}
	public static int save(Emp e)
	{
		int status=1;
		try
		{
			Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into crud(name,password,email,country)values(?,?,?,?);");
			ps.setString(1,e.getName());
			ps.setString(2,e.getPassword());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			status=ps.executeUpdate();
			con.close();
			
			
			
		}
			
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return status;
		
		
	}

public static List<Emp>getAllEmployees()
{
	List<Emp> list=new ArrayList<Emp>();
	try
	{
		Connection con=EmpDao.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from crud");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
				Emp e=new Emp();
				e.setId((rs.getInt(1)));
				e.setName((rs.getString(2)));
				e.setPassword((rs.getString(3)));
				e.setEmail((rs.getString(4)));
				e.setCountry((rs.getString(5)));
				list.add(e);
				
		}
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}
public static Emp getEmployeeById(int id) {
	// TODO Auto-generated method stub
	Emp e=new Emp();
	try
	{
		Connection con=EmpDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from crud where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setPassword(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setCountry(rs.getString(5)); 
			}
			con.close();
			
	}
	catch(Exception exx)
	{
		System.out.println(exx);
	}
	
	
	
	return e;
}
public static int update(Emp e) {
	// TODO Auto-generated method stub
	int status=1;
	try
	{
		Connection con=EmpDao.getConnection();
		PreparedStatement ps=con.prepareStatement("update crud set name=?,password=?,email=?,country=? where id=?");
		ps.setString(1, e.getName());
		ps.setString(2, e.getPassword());
		ps.setString(3, e.getEmail());
		ps.setString(4, e.getCountry());
		ps.setInt(5, e.getId());
		status=ps.executeUpdate();
		con.close();
		
		
	}
	catch(Exception exxx)
	{
		System.out.println(exxx);
	}
	
	
	
	return status;
}
public static void delete(int id) {
	// TODO Auto-generated method stub
	
	try
	{
		Connection con=EmpDao.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from crud where id=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		con.close();
		
	}
	catch(Exception exxxx)
	{
		System.out.println(exxxx);
	}
	
	
}
}



















