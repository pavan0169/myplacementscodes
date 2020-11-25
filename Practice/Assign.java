import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class Assign {
	public static void main(String[] args)
	{
		try {
			Scanner sc=new Scanner(System.in);
			String un=sc.nextLine();
			String pass=sc.nextLine();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
			PreparedStatement st=con.prepareStatement("Select * from userdetails where user_name=? and pass_word=?;");
			st.setString(1,un);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
				System.out.println("Login Sucessful");
			else
				System.out.println("Invalid username/password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
