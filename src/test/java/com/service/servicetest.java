package com.service;

import com.base.basetest;
import com.entity.Article;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import java.util.List;

public class servicetest extends basetest {

    @Autowired
    private ArticleService articleService;
    @Test
    public void serviceTest(){
        System.out.println("------------------------------");
        System.out.println(articleService.countArticle());
        System.out.println("------------------------------");
    }

    @Test
    public void CountArticleByStatusServiceTest(){
        System.out.println("------------------------------");
        System.out.println(articleService.countArticleByStatus(0));
        System.out.println("------------------------------");
    }

    @Test
    public void CreateArticleServiceTest(){
        Article article = new Article();
        article.setArticleTitle("service");
        article.setArticleContent("servicetestcontent");
        article.setArticleUserId(10);
        article.setArticleThumbNail("1.png");
        article.setArticleCreateTime(new Date());
        article.setArticleUpdateTime(new Date());
        article.setArticleSummary("summary");
        article.setArticleStatus(1);
        System.out.println("------------------------------");
        articleService.createArticle(article);
        System.out.println("------------------------------");
    }
    @Test
    public void DeleteArticleServiceTest(){
        articleService.deleteArticle(51);
    }
    @Test
    public void ListArticleByStatus(){
        List<Article> list;

        list = articleService.listArticleByStatus(1);
        for (Article article : list) {
            System.out.println(article);
        }
    }

    @Test
    public void UpdateArticle(){
        Article article = new Article();
        article.setArticleId(52);
        article.setArticleTitle("UPDATE");
        article.setArticleContent("servicetestcontent");
        article.setArticleUserId(10);
        article.setArticleThumbNail("1.png");
        article.setArticleViewCount(0);
        article.setArticleCreateTime(new Date());
        article.setArticleUpdateTime(new Date());
        article.setArticleSummary("summary");
        article.setArticleStatus(1);
        articleService.UpdateArticle(article);
    }
    @Test
    public void SelectArticleById(){
        System.out.println(articleService.selectArticleById(52));
    }
}
