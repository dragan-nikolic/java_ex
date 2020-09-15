package org.dragan;

import java.sql.*;

public class TestMySqlConnection {
    static final String dbUrl = "jdbc:mysql://localhost:3306/world?serverTimezone=UTC";
    static final String username = "root";
    static final String password = "madmin11";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Connected to MySQL sample database world!");
    }
}
