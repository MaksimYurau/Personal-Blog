package by.maksim.repository;

import by.maksim.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    List<User> findByName(String name);
    void deleteByUsername(String username);
    User getUserByUsername(String username);
//    User findByGoogleUsername(String googleUsername);
//    User findByGoogleName(String googleName);
}
