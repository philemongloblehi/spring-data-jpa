package com.spring.jpa.repository;

import com.spring.jpa.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Philémon Globléhi <philemon.globlehi@gmail.com>
 */
@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
