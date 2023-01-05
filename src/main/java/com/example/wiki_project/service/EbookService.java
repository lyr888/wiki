package com.example.wiki_project.service;


import com.example.wiki_project.domain.Ebook;
import com.example.wiki_project.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    //获取电子数列表
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
