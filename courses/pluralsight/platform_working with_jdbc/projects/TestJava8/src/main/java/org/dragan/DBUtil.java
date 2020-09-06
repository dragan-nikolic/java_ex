package org.dragan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection(DBType dbType) throws SQLException {
        switch(dbType) {
            case ORADB:
                return DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521/xepdb1",
                        "hr",
                        "hr");
            case MYSQLDB:
                return DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/world",
                        "root",
                        "madmin");
            default:
                return null;
        }
    }

    public static void showErrorMessage(SQLException e) {
        System.err.println("Error message: " + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
    }
}
