package com.example.wiki_project.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String Name;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "heoll word"+Name;
    }
}
