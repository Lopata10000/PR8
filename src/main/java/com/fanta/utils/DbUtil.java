package com.fanta.utils;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public final class DbUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/Theater";
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "45435";

    private DbUtil(){}
    private static final HikariConfig pullConfiguration = new HikariConfig();

    static {
        pullConfiguration.setJdbcUrl(URL);
        pullConfiguration.setUsername(USER_NAME);
        pullConfiguration.setPassword(PASSWORD);
        pullConfiguration.setMaximumPoolSize(10);
        pullConfiguration.setConnectionTimeout(100000);
        pullConfiguration.setMaxLifetime(18000000);
        pullConfiguration.setPoolName("money-with-soul Pool");
    }

    public static Connection getConnection(){
        try {
            HikariDataSource dataSource = new HikariDataSource(pullConfiguration);
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
