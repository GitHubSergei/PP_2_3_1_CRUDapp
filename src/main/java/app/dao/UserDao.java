package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {


    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}

