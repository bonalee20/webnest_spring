package com.app.webnest.repository;

import com.app.webnest.mapper.CommentLikeMapper;
import com.app.webnest.mapper.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CommentLikeDAO {
    private final CommentLikeMapper commentLikeMapper;

    public int findCommentLike(Long commentId) {
        return commentLikeMapper.selectByPostIdcount(commentId);
    }
//    int selectByPostIdcount (Long commentId);
}
