package com.service;

import com.entity.Comment;

import java.util.List;

public interface CommentService {

    /**
     *根据评论id查找评论
     * @param commentId
     * @return 评论内容
     */
    Comment selectCommentById(Integer commentId);


    /**
     *添加评论
     * @param comment
     */
    void insertComment(Comment comment);

    /**
     *根据id删除评论
     * @param commentId
     */
    void deleteCommentById(Integer commentId);

    /**
     * 根据文章id展示评论
     * @param articleId
     * @return
     */
    List<Comment> listCommentByArticle(Integer articleId);

    /**
     * 根据用户展示评论
     * @param userId
     * @return
     */
    List<Comment> listCommentByUser(Integer userId);

}
