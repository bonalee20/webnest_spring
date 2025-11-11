package com.app.webnest.service;

import com.app.webnest.repository.CommentLikeDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentLikeServiceImpl implements CommentLikeService {
    private final CommentLikeDAO commentLikeDAO;

    @Override
    public int getCommentLike(Long commentId) {
        return commentLikeDAO.findCommentLike(commentId);
    }
}
