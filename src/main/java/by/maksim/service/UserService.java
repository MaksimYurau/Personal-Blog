package by.maksim.service;

import by.maksim.domain.User;
import by.maksim.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean addUser(String username, String password, String name) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setActive(true);
        userRepository.save(user);
        log.info("User was registered successfully.");
        return true;
    }

    public boolean createUsersWithArrayInput(List<User> users) {
        userRepository.saveAll(users);
        return true;
    }

    public boolean createUsersWithListInput(List<User> users) {
        userRepository.saveAll(users);
        return true;
    }

    public User getUserByUserName(String username) {
        return userRepository.getUserByUsername(username);
    }

    public boolean updateUser(@Valid User user) {
        if (userRepository.existsById((long) user.getId())) {
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }

    public ResponseEntity<Void> logoutUser() {
        return ResponseEntity.ok().build();
    }
}
