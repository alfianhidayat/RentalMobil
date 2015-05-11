/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.database;

/**
 *
 * @author Alfian Hidayat
 */
import java.sql.*;

public class ConnectionDB {

    static final String JDBC_DRIVER = "org.sqlite.JDBC";
    static final String DB_URL = "jdbc:sqlite:rental.sqlite";
    public static Connection conn = null;
    public Statement stm = null;
    public ResultSet rst = null;

    public Connection getConnection() {
        return conn;
    }

    public ConnectionDB() {
        try {
            Class.forName(JDBC_DRIVER);
            if (conn == null) {
                conn = DriverManager.getConnection(DB_URL);
            }
        } catch (Exception e) {
            System.err.print(e.getMessage());
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            stm = conn.createStatement();
            rst = stm.executeQuery(query);
            return rst;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return rst;
    }

    public Statement executeUpdate(String query) {
        try {
            stm = conn.createStatement();
            stm.executeUpdate(query);
            return stm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stm;
    }

    public PreparedStatement updateStmt(String query) {
        PreparedStatement update = null;
        try {
            update = conn.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

}
