package hseaidbox.example.demo.service;

import hseaidbox.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

}
