package com.libapi.repository.jdbcconnection;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
@Component
public class ConnectionProvider {

    public Connection connectionJdbc(){
        Connection connection;
        // load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        // create the connection...
        String user = "root";
        String password = "Istiyak@mi9";
        String url = "jdbc:mysql://localhost:3306/boot_lib";
        connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
