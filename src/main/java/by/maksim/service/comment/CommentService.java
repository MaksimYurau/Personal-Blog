package by.maksim.service.comment;

import by.maksim.domain.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
    List<Comment> showAllCommentsByPostId(long id);
    void removeComment(long id);
}
