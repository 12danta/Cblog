package com.service.impl;

import com.entity.Link;
import com.mapper.LinkMapper;
import com.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkMapper linkMapper;

    @Override
    public Link selectLinkById(Integer linkId) {
        return linkMapper.selectLinkById(linkId);
    }

    @Override
    public List<Link> listLinkByUserId(Integer userId) {
        return linkMapper.listLinkByUserId(userId);
    }

    @Override
    public void insertLink(Link link) {
        linkMapper.insertLink(link);
    }

    @Override
    public void deleteLink(Integer linkId) {
        linkMapper.deleteLink(linkId);
    }

    @Override
    public void updateLink(Link link) {
        linkMapper.updateLink(link);
    }
}
