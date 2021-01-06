package by.maksim;

import by.maksim.domain.Post;
import by.maksim.repository.PostRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
class PostTests {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testAddPost() {
        Post post = new Post("title", "anons", "full_text");
        postRepository.save(post);
    }
}
