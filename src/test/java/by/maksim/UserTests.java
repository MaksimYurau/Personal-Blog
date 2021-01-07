package by.maksim;

import by.maksim.domain.User;
import by.maksim.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void registrationTest() {
        User user = new User("testUsername", "testPassword", "testName", true);
        userRepository.save(user);
    }
}
