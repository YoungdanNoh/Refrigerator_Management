
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noyeongdan
 */
public class DB {
    public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://127.0.0.1:3306/Refrigerator_management?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "dbwjd7052";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
