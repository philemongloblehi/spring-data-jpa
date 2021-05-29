package com.spring.jpa.service;

import com.spring.jpa.model.Comment;
import com.spring.jpa.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Transactional
    public Iterable<Comment> getComments() {
        return this.commentRepository.findAll();
    }

    @Transactional
    public Optional<Comment> getCommentById(Integer id) {
        return this.commentRepository.findById(id);
    }
}
