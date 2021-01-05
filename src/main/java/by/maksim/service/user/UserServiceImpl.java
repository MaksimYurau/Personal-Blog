package by.maksim.service.user;

import by.maksim.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User showUserById(long id) {
        return null;
    }

    @Override
    public User showUserByUsername(String username) {
        return null;
    }

    @Override
    public List<User> showAllUsers() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void updateUser(long id) {

    }

    @Override
    public boolean containsUser(String username) {
        return false;
    }

    @Override
    public void removeUser(long id) {

    }
}
