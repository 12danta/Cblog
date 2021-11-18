package com.mapper;

import com.base.basetest;
import com.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


public class mappertest extends basetest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void CountArticle(){
        System.out.println("====================================");
        System.out.println(articleMapper.countArticle());
        System.out.println("====================================");
    }


}
