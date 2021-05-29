package com.spring.jpa.controller;

import com.spring.jpa.model.Comment;
import com.spring.jpa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@RestController
@RequestMapping(path = "/api/v1/rest/comments", name = "app_comments_")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping(name = "list")
    public Iterable<Comment> list() {
        return this.commentService.getComments();
    }

    @GetMapping(path = "/{id}", name = "details")
    public Optional<Comment> show(@PathVariable int id) {
        return this.commentService.getCommentById(id);
    }
}
