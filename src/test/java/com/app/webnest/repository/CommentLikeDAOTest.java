package com.app.webnest.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CommentLikeDAOTest {
    @Autowired
    private CommentLikeDAO commentLikeDAO;
    @Test
    void findCommentLikffe() {
        commentLikeDAO.findCommentLike(1L);


        Long commentId = 1L;
        // 만약 기존 메서드명이 selectByPostIdcount 라면 ↓ 요 줄로 바꾸세요
        long cnt = commentLikeDAO.findCommentLike(commentId);

        log.info("commentId={} 의 좋아요 개수 = {}", commentId, cnt);
    }
}