package com.app.webnest.mapper;

import com.app.webnest.domain.vo.CommentLikeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentLikeMapper {
    // 게시글 상세에서 좋아요 개수
    int selectByPostIdcount (Long commentId);
}
