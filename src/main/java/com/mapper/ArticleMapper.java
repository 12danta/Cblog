package com.mapper;

import com.entity.Article;

import java.util.List;

public interface ArticleMapper {

    /**
     * 添加新文章
     * @param article 文章
     * @return
     */
    void createArticle(Article article);

    /**
     * 根据文章id删除文章
     * @param articleId 文章
     * @return  行数
     */
    void deleteArticleById(Integer articleId);

    /**
     * 更新文章内容
     * @param article 文章id
     * @return  行数
     */
    void updateArticle(Article article);

    /**
     * 统计文章数量
     * @return 文章数量
     */
    Integer countArticle();

    /**
     *根据状态统计文章数量   1：已发布  0：草稿
     * @return 文章数量
     */
    Integer countArticleByStatus(Integer status);

    /**
     * 根据文章状态返回文章列表
     * @param status
     * @return 文章列表
     */
    List<Article> listArticleByStatus(Integer status);

    /**
     * 根据文章id查找文章
     * @param articleId
     * @return
     */
    Article selectArticleById(Integer articleId);

    /**
     * 列出所有文章
     * @return 文章列表
     */
    List<Article> findAllArticle();



}
