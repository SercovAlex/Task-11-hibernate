package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.postgresql.Driver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan","Ivanov", (byte) 25);
        userService.saveUser("Petr","Petrov", (byte) 342);
        userService.saveUser("Alek","Aleks", (byte) 50);
        userService.saveUser("Sergey","Sergeev", (byte) 21);
        List<User> userList1 = userService.getAllUsers();
        userList1.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
