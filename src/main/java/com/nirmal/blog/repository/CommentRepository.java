package com.nirmal.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmal.blog.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
