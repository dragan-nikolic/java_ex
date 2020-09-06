package org.dragan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExceptionHandling {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //conn = DBUtil.getConnection(DBType.ORADB);
            conn = DBUtil.getConnection(DBType.MYSQLDB);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            //rs = stmt.executeQuery("select * from Countries");  // OK
            rs = stmt.executeQuery("select * from MyCountries");  // table or view does not exist exception

            rs.last();
            System.out.println("Total number of rows: " + rs.getRow());
        } catch (SQLException e) {
            DBUtil.showErrorMessage(e);
        } finally {
            conn.close();
        }
    }
}
