package com.blueyonder.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

    private static final String URL="jdbc:postgresql://localhost:5432/bydb";
    //Static method which returns object of Connection type
    public static Connection getDBConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, "postgres", "password");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }
}
