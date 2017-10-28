import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {

		Connection conn;
		Statement stmt;
		ResultSet rs;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
			stmt = conn.createStatement();
//			int rowsAffected = stmt.executeUpdate("insert into employees (lastName, firstName, email, "
//					+ "department, salary) values ('Wright', 'Eric', 'eric.wright@goo.com', 'HR', 33000.00),"
//					+ " ('Wall', 'Carl', 'carl.wall@goo.com', 'HR', 15000.00), ('Matter', 'Henry',"
//					+ " 'henry.matter@gmail.com', 'TI', 29000.00), ('Diggs', 'John', 'john.diggs@yahoo.com', "
//					+ "'HR', 33000.00), ('Barbera', 'Ana', 'ana.barbera@hotmail.com', 'CEO', 150000.00);");

			rs = stmt.executeQuery("select * from employees order by lastName");
			
			while (rs.next()) {
				System.out.println(rs.getString("firstName") + " " + rs.getString("lastName") + ", " + rs.getString("email"));
			}
			
//			int rowsAffected = stmt.executeUpdate("update employees set email = 'eric.wright@hotmail.com' where"
//					+ " lastName = 'Wright' and firstName = 'Eric';");
			
			stmt.execute("delete from employees where firstName = 'Henry';");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
