package com.example.wiki_project.service;


import com.example.wiki_project.domain.Test;
import com.example.wiki_project.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;


    public List<Test> list(){
        return testMapper.list();
    }
}
