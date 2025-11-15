package com.app.webnest.repository;

import com.app.webnest.domain.dto.CommentDTO;
import com.app.webnest.domain.dto.PostResponseDTO;
import com.app.webnest.domain.vo.CommentVO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.mapper.CommentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class CommentDAO {
    private final CommentMapper commentMapper;

    public List<CommentDTO> findCommentPostId(Long postId, Long userId) {
        Map<String, Long> params = new HashMap<>();
        params.put("postId", postId);
        params.put("userId", userId);
        return commentMapper.selectByPostId(params);
    }

    //답글 작성
    public Long saveComment(CommentVO commentVO) {
        commentMapper .insertComment(commentVO);
        return commentVO.getId();
    }

    //답글 수정
    public void modifyComment(CommentVO commentVO) {
        commentMapper.updateComment(commentVO);
    }

    //답글 삭제
    public void delete(Long id){
        commentMapper.deleteComment(id);
    }

    //채택
    public void choose(Long commentId) {
        commentMapper.acceptComment(commentId);
    }
}
