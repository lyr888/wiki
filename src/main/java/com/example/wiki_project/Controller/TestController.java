package com.example.wiki_project.Controller;


import com.example.wiki_project.domain.Test;
import com.example.wiki_project.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String Name;

    @Autowired
    private TestService testService;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "heoll word"+Name;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Test> list(){
        return testService.list();
    }
}
