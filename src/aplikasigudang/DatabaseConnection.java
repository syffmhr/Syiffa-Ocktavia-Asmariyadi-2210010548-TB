/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasigudang;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Syffmhr
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/db_gudang";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
