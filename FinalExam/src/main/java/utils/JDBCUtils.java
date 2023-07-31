package utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {

  public Connection connection;

  //Tao connection
  public Connection getConnection()
      throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {

    Properties pro = new Properties();
    pro.load(new FileInputStream("resources/database.properties"));

    String url = pro.getProperty("urlConnection");
    String username = pro.getProperty("username");
    String password = pro.getProperty("password");
    String driver = pro.getProperty("driver");
    Class.forName(driver);
    connection = DriverManager.getConnection(url, username, password);
    System.out.println("Connection OK");

    return connection;

  }
  public void disconnect() throws SQLException {
    if (connection != null && connection.isClosed()) {
      connection.close();
    }
  }

// test connect
  public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
    JDBCUtils jd = new JDBCUtils();
    jd.getConnection();
  }


  public ResultSet executeQuery(String sql) {
  }
}

