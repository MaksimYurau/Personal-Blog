package by.maksim.service.user;

import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User showUserById(long id);
    User showUserByUsername(String username);
    List<User> showAllUsers();
    void update(User user);
    void updateUser(long id);
    boolean containsUser(String username);
    void removeUser(long id);
}
