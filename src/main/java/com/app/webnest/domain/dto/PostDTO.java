package com.app.webnest.domain.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class PostDTO {
    private Long id;
    private String postContent;
    private String postTitle;
    private Date postCreateAt;
    private Integer postViewCount;
    private Long userId;
    private String postType;
    private String userThumbnailName;
    private String userThumbnailUrl;
    private String userNickname;
}
