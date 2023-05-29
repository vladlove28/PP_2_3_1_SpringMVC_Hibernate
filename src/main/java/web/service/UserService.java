package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User readUser(int id);

}
