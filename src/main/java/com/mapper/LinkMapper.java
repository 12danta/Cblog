package com.mapper;

import com.entity.Link;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LinkMapper {

    /**
     * 根据id获取连接
     * @param linkId
     */
    Link selectLinkById(Integer linkId);

    /**
     * 根据用户id获取连接表单
     * @param userId
     * @return
     */
    List<Link> listLinkByUserId(Integer userId);

    /**
     * 添加link
     * @param link
     */
    void insertLink(Link link);
    /**
     * 根据id删除link
     * @param linkId
     */
    void deleteLink(Integer linkId);
    /**
     * 修改link内容
     * @param link
     */
    void updateLink(Link link);
}
