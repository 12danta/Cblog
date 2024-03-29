package com.service.impl;

import com.entity.Comment;
import com.mapper.CommentMapper;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;


    @Override
    public Comment selectCommentById(Integer commentId) {
        return commentMapper.selectCommentById(commentId);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertComment(Comment comment) {
        commentMapper.insertComment(comment);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteCommentById(Integer commentId) {
        commentMapper.deleteCommentById(commentId);
    }

    @Override
    public List<Comment> listCommentByArticle(Integer articleId) {
        return commentMapper.listCommentByArticle(articleId);
    }

    @Override
    public List<Comment> listCommentByUser(Integer userId) {
        return commentMapper.listCommentByUser(userId);
    }
}
