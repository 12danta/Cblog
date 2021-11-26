package com.service.impl;

import com.entity.Article;
import com.mapper.ArticleMapper;
import com.mapper.CommentMapper;
import com.mapper.TagMapper;
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
    private CommentMapper commentMapper;
    private TagMapper tagMapper;

    @Override
    public Integer countArticle() {
        return articleMapper.countArticle();
    }

    @Override
    public Integer countArticleByStatus(Integer status) {
        return articleMapper.countArticleByStatus(status);
    }


    @Override
//    @Transactional(rollbackFor = Exception.class)
    public void createArticle(Article article) {
        //添加文章
        article.setArticleCreateTime(new Date());
        article.setArticleCreateTime(new Date());
        articleMapper.createArticle(article);
        //添加分类

        //添加tag
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteArticle(Integer articleId) {
        //删除文章
        articleMapper.deleteArticleById(articleId);
        //删除文章评论

        //删除文章标签

        //删除文章分类
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
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
