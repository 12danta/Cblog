package com.service;

import com.base.basetest;
import com.entity.Tag;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TagServiceTest extends basetest {

    @Autowired
    private TagService tagService;

    @Test
    public void selectTagById(){
        System.out.println(tagService.selectTagById(23));
    }

    @Test
    public void InsertTag(){
        Tag tag = new Tag();
        tag.setTagName("go");
        tagService.InsertTag(tag);
    }

    @Test
    public void DeleteTag(){
        tagService.deleteTag(20);
    }
}
