package com.service.impl;

import com.entity.Tag;
import com.mapper.TagMapper;
import com.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public Tag selectTagById(Integer tagId) {
        return tagMapper.selectTagById(tagId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void InsertTag(Tag tag) {
        tagMapper.InsertTag(tag);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteTag(Integer tagId) {
        tagMapper.deleteTag(tagId);
    }
}
