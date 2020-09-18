package org.dragan;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
    public static void main(String[] args) {
        try(Connection conn = DBUtil.getConnection(DBType.MYSQLDB)) {
            DatabaseMetaData dbmd = conn.getMetaData();

            // Retrieving DB information
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("User: " + dbmd.getUserName());
            System.out.println("Driver Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Driver Product Version: " + dbmd.getDatabaseProductVersion());

            // Retrieving table names
            String catalog = null;
            String schemaPattern = null;
            String tableNamePattern = null;
            String schemaTypes[] = {"TABLE"};

            ResultSet rs = dbmd.getTables(catalog, schemaPattern, tableNamePattern, schemaTypes);

            System.out.println("Tables");
            System.out.println("======");

            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        }
    }
}
