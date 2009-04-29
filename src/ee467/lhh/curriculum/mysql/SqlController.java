package ee467.lhh.curriculum.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlController {
  /** Required fields to make the connection to the sql server */
  private String LOGIN_NAME = "";
  private String PASSWORD = "";
  private String URL = "jdbc:mysql://localhost";
  private GradeReportReader reportReader;
  private GradeReportWriter reportWriter;
  private WorkOrderReader orderReader;
  private WorkOrderWriter orderWriter;

  public SqlController(String loginName, String password, String url) {
    this.LOGIN_NAME = loginName;
    this.PASSWORD = password;
    this.URL = url;
    this.reportReader = new GradeReportReader();
    this.reportWriter = new GradeReportWriter();
    this.orderReader = new WorkOrderReader();
    this.orderWriter = new WorkOrderWriter();
  }

  /**
   * Method that makes a connection with the MySqlServer
   * @return the connection
   */
  public Connection makeConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
    }
    catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    catch (InstantiationException e) {
      e.printStackTrace();
    }
    catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    try {
      Connection connection = DriverManager.getConnection(URL, LOGIN_NAME, PASSWORD);
      return connection;
    }
    catch (SQLException x) {
      System.out.println("Couldn’t get connection!");
      System.out.println(x.getMessage());
      x.printStackTrace();
    }
    return null;
  }
}
