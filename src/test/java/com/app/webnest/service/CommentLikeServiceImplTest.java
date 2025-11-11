package com.app.webnest.service;

import com.app.webnest.repository.CommentLikeDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CommentLikeServiceImplTest {
    @Autowired
    private CommentLikeService commentLikeService;

    @Test
    void getCommentLike() {

        commentLikeService.getCommentLike(1L);
        Long commentId = 1L;



        // 만약 기존 메서드명이 selectByPostIdcount 라면 ↓ 요 줄로 바꾸세요
        long cnt = commentLikeService.getCommentLike(commentId);

        log.info("commentId={} 의 좋아요 개수 = {}", commentId, cnt);
    }
}