package by.maksim.service.comment;

import by.maksim.domain.Comment;
import by.maksim.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void addComment(Comment comment) {

    }

    @Override
    public List<Comment> showAllCommentsByPostId(long id) {
        return null;
    }

    @Override
    public void removeComment(long id) {

    }
}
