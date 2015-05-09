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
public class Query {
    public final String INSERT_USER_QUERY = "INSERT INTO tb_user VALUES (?,?);";
    public final String DELETE_USER_QUERY = "DELETE FROM tb_user WHERE username=? and password=?;";
}
