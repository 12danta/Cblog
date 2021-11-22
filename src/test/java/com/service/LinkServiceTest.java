package com.service;

import com.base.basetest;
import com.entity.Link;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LinkServiceTest extends basetest {
    @Autowired
    private LinkService linkService;

    Link link = new Link();


    @Test
    public void selectLinkById(){
        System.out.println(linkService.selectLinkById(1));
    }

    @Test
    public void listLinkByUserId(){
        List list;
        list = linkService.listLinkByUserId(5);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Test
    public void insertLink(){
        link.setLinkCoin("twitter.png");
        link.setLinkContent("www.twitter.com");
        link.setLinkType("推特");
        link.setLinkUserId(5);

        linkService.insertLink(link);
    }

    @Test
    public void deleteLink(){
        linkService.deleteLink(3);
    }

    @Test
    public void updateLink(){
        link.setLinkType("1111");
        linkService.updateLink(link);
    }
}
