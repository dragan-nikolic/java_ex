package org.dragan;

import java.sql.*;

public class TestOracleConnection {
    static final String dbUrl = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    static final String username = "hr";
    static final String password = "hr";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, username, password);
        System.out.println("Connected to Oracle sample database HR!");
    }
}
