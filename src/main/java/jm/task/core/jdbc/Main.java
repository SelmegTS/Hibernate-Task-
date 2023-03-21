package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

            userService.createUsersTable();

            userService.saveUser("Jack", "Smith", (byte) 18);
            userService.saveUser("Bred", "Pith", (byte) 23);
            userService.saveUser("Tiffani", "Bright", (byte) 25);
            userService.saveUser("Helen", "Stone", (byte) 20);

            userService.removeUserById(1);

            System.out.println(userService.getAllUsers());

//            userService.cleanUsersTable();
//
//            userService.dropUsersTable();
    }
}
