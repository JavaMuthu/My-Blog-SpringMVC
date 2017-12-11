package com.nirmal.blog.service;

import com.nirmal.blog.controller.ForbiddenException;
import com.nirmal.blog.model.Comment;
import com.nirmal.blog.model.Post;

/**
 * 
 * @author muthu_m
 *
 */
public interface CommentService 
{
    Comment getComment(Long id);

    Long saveNewComment(Comment comment, Post post, Long parentId);

    void deleteComment(Long commentId) throws ActionExpiredException;

    void updateComment(Comment newCommentData, Long commentId) throws ActionExpiredException;

    void vote(Long commentId, boolean like) throws AlreadyVotedException, ForbiddenException;
}
