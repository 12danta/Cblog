package com.service;

import com.entity.Article;
import org.apache.arrow.flatbuf.Int;

import java.util.List;

public interface ArticleService {

    /**
     * 统计文章数量
     * @return 文章数量
     */
    Integer countArticle();

    /**
     * 根据文章状态统计文章数量
     * @return 文章数量
     */
    Integer countArticleByStatus(Integer status);

    /**
     * 新建文章
     * @param article
     */
    void createArticle(Article article);

    /**
     * 根据id删除文章
     * @param articleId
     */
    void deleteArticle(Integer articleId);

    /**
     * 根据状态返回文章列表
     * @param status
     * @return
     */
    List<Article> listArticleByStatus(Integer status);

    /**
     * 更新文章内容
     * @param article
     */
    void UpdateArticle(Article article);

    /**
     * 刷新文章
     * @param article
     */
    void FlushArticle(Article article);

    /**
     * 根据id查询文章
     * @param articleId
     * @return
     */
    Article selectArticleById(Integer articleId);




}
