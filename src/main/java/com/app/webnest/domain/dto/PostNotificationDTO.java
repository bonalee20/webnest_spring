package com.app.webnest.domain.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PostNotificationDTO {
    private Long id;
    private String postNotificationAction;
    private boolean notificationIsRead;
    private Date notificationCreateAt;
    private String userThumbnailUrl;
    private int userLevel;
    private String userNickname;
    private Long postId;
    private Long actorUserId;
    private Long receiverUserId;
    private String postTitle;
    private String postContent;
    private String postType;
}
