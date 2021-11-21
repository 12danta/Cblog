package com.service;

import com.base.basetest;
import com.entity.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class CommentServiceTest extends basetest {

    @Autowired
    private CommentService commentService;

    @Test
    public void CommentService(){
        System.out.println(commentService.selectCommentById(10));
    }
    @Test
    public void deleteCommentById(){
        commentService.deleteCommentById(10);
    }
    @Test
    public void insertComment(){
        Comment comment = new Comment();
        comment.setCommentContent("123test");
        comment.setCommentArticleId(51);
        comment.setCommentUserId(2);
        comment.setPreCommentId(1);
        comment.setCommentCreateTime(new Date());
        commentService.insertComment(comment);
    }
    @Test
    public void ListCommentByUser(){
        List<Comment> list;
        list = commentService.listCommentByUser(2);
        for (Comment comment : list) {
            System.out.println(comment);
        }
    }
    @Test
    public void ListCommentByArticle(){
        List<Comment> list;
        list = commentService.listCommentByArticle(51);
        for (Comment comment : list) {
            System.out.println(comment);
        }
    }

}
