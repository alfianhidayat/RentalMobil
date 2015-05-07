/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental.dbconnection;

/**
 *
 * @author Alfian Hidayat
 */
import java.sql.*;

public class ConnectionDB {

    public Connection conn = null;
    public Statement stm = null;
    public ResultSet rst = null;

    public Connection getConnection() {
        return conn;
    }

    public ConnectionDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:rental.sqlite");
            System.out.println("Connection Success");

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

}
