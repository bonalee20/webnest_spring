package com.app.webnest.api.privateapi;

import com.app.webnest.domain.dto.ApiResponseDTO;
import com.app.webnest.service.CommentLikeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/commentLike")
public class CommentLikeApi {

    private final CommentLikeService commentLikeService;

    @GetMapping("/{commentId}")
    public ResponseEntity<ApiResponseDTO> getCommentLikeCount(@PathVariable("commentId") Long commentId) {
        int likeCount = commentLikeService.getCommentLike(commentId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDTO.of("댓글 좋아요 수 조회 성공", likeCount));
    }
}
