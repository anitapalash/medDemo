package hseaidbox.example.demo.service;

import hseaidbox.example.demo.model.User;
import hseaidbox.example.demo.repositories.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

}
