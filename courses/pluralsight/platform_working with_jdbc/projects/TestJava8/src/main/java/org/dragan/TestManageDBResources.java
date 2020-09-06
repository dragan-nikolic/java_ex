package org.dragan;

import java.sql.Connection;
import java.sql.SQLException;

import static org.dragan.DBType.ORADB;

public class TestManageDBResources {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConnection(ORADB);
        System.out.println("Connected to Oracle sample database world via Manager!");
    }
}
