package com.mapper;

import com.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommentMapper {
    /**
     * 根据id查找评论
     * @param commentId
     * @return
     */
    Comment selectCommentById(Integer commentId);

    /**
     *添加评论
     * @param comment
     */
    Integer insertComment(Comment comment);

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
