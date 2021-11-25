package com.service.impl;

import com.entity.Article;
import com.mapper.ArticleMapper;
import com.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Integer countArticle() {
        return articleMapper.countArticle();
    }

    @Override
    public Integer countArticleByStatus(Integer status) {
        return articleMapper.countArticleByStatus(status);
    }

    @Transactional(noRollbackFor = Exception.class)
    @Override
    public void createArticle(Article article) {
        articleMapper.createArticle(article);
    }

    @Transactional(noRollbackFor = Exception.class)
    @Override
    public void deleteArticle(Integer articleId) {
        //删除文章
        articleMapper.deleteArticleById(articleId);
        //删除文章评论
        //删除文章标签
        //删除文章分类
    }

    @Transactional(noRollbackFor = Exception.class)
    @Override
    public void UpdateArticle(Article article) {

        article.setArticleUpdateTime(new Date());
        articleMapper.updateArticle(article);
        //更新标签
        //更新分类
    }
    public void FlushArticle(Article article) {
        articleMapper.updateArticle(article);
    }

    @Override
    public Article selectArticleById(Integer articleId) {
        return articleMapper.selectArticleById(articleId);
    }

    @Override
    public List<Article> listArticleByStatus(Integer status) {
        return articleMapper.listArticleByStatus(status);
    }



}
