package hseaidbox.example.demo.controller;

import hseaidbox.example.demo.model.User;
import hseaidbox.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
