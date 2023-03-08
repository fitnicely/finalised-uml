import java.sql.*;

public class Database {
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://db4free.net/oopweek8", "helloworld2023", "helloworld");

      System.out.println("Connection is created successfully:");
      
      stmt = (Statement) conn.createStatement();
      String query1 = "INSERT INTO InsertDemo " + "VALUES (1, 'John', 34)";
      stmt.executeUpdate(query1);
      query1 = "INSERT INTO InsertDemo " + "VALUES (2, 'Carol', 42)";
      stmt.executeUpdate(query1);
      System.out.println("Record is inserted in the table successfully..................");
      } catch (SQLException excep) {
         excep.printStackTrace();
      } catch (Exception excep) {
         excep.printStackTrace();
      } finally {
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException se) {}
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }  
      }
      System.out.println("Please check it in the MySQL Table......... ……..");
   }
}