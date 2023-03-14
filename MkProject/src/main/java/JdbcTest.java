import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest  {
	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tharun","root","root");
			System.out.println("connection created successfully..........");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
