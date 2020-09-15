package org.dragan;

import java.sql.*;
import java.util.Scanner;

public class TestPreparedInsert {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtil.getConnection(DBType.MYSQLDB);

        int id;
        String name;
        String countryCode;
        String district;
        int population;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter city ID: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter city name: ");
        name = scanner.nextLine();
        System.out.print("Enter country code: ");
        countryCode = scanner.nextLine();
        System.out.print("Enter district: ");
        district = scanner.nextLine();
        System.out.print("Enter city population: ");
        population = Integer.parseInt(scanner.nextLine());

        String sql = "insert into city values (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, countryCode);
        pstmt.setString(4, district);
        pstmt.setInt(5, population);

        int result = pstmt.executeUpdate();

        if (result == 1) {
            System.out.println("Record inserted successfully.");
        } else {
            System.err.println("Error while adding the record!");
        }

        if (scanner != null) scanner.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    }
}
