package org.dragan;

import java.sql.Connection;
import java.sql.SQLException;

public class TestManageDBResources {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConnection(DBType.ORADB);
        System.out.println("Connected to Oracle sample database world via Manager!");
    }
}
