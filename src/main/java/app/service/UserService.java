package app.service;

import app.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User getUserById(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
