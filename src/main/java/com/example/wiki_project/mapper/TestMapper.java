package com.example.wiki_project.mapper;

import com.example.wiki_project.domain.Test;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface TestMapper {

    public List<Test> list();
}
