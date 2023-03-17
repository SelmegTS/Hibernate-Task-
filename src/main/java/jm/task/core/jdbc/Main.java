package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Connection connection = Util.getConnection();
        UserService userService = new UserServiceImpl();

        try {
            userService.createUsersTable();

            userService.saveUser("Jack", "Smith", (byte) 18);
            userService.saveUser("Bred", "Pith", (byte) 23);
            userService.saveUser("Tiffani", "Bright", (byte) 25);
            userService.saveUser("Helen", "Stone", (byte) 20);

            userService.removeUserById(1);

            System.out.println(userService.getAllUsers());

            userService.cleanUsersTable();

            userService.dropUsersTable();

        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
