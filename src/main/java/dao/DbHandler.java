package dao;

import java.sql.*;

public class DbHandler {
    //variables
    public static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static String DB_URL = "jdbc:mysql://localhost:3306/store";
    public static String username = "root";
    public static String password = "";

    //connectivity
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rst = null;

    //constructor
    public DbHandler() {
        getConnection();
        System.out.println("Connected");
    }


    public static Connection getConnection() {
        try {
            //Register driver
            Class.forName(JDBC_DRIVER);

            //Create Connection to DB
            con = DriverManager.getConnection(DB_URL, username, password);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return con;


    }

    public void writeDb(String query) throws SQLException {
        //create statement object for executing queries with db
        Connection conn = getConnection();
        stmt = conn.createStatement();
        stmt.executeUpdate(query);
        if (conn!=null) {
            conn.close();
        }
        if(stmt!=null) {
            stmt.close();
        }
        if (rst!=null) {
            rst.close();
        }
    }

    public static ResultSet readFromDb(String query) throws SQLException {
        //create statement object for executing queries with db
        Connection conn = getConnection();
        stmt = conn.createStatement();
        rst = stmt.executeQuery(query);
        /**
         while (rst.next())
         System.out.println(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getString(3));
         if (conn!=null) {
         conn.close();
         }
         if(stmt!=null) {
         stmt.close();
         }
         if (rst!=null) {
         rst.close();
         }**/
        return rst;
    }
    //Using Prepared Statement


}
