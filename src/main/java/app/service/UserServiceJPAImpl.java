package app.service;

import app.model.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceJPAImpl /*implements UserService*/ {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceJPAImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void addUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Transactional
    public void updateUser(int id, User user) {
        user.setId(id);
        userRepository.save(user);
    }

    @Transactional
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
