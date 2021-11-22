package com.service;

import com.entity.Tag;

public interface TagService {
    /**
     * 根据id查找tag
     * @param tagId
     */
    Tag selectTagById(Integer tagId);

    /**
     * 添加tag
     * @param tag
     */
    void InsertTag(Tag tag);

    /**
     * 根据tagId删除tag
     * @param tagId
     */
    void deleteTag(Integer tagId);
}
