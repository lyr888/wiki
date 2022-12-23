package com.example.wiki_project;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

@SpringBootApplication
public class WikiProjectApplication {

    private static final Logger logger=Logger.getLogger(WikiProjectApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WikiProjectApplication.class);
//        SpringApplication.run(WikiProjectApplication.class, args);
        Environment env = app.run(args).getEnvironment();
        logger.info("启动成功");
//        logger.info("地址：\t http://127.0.0.1:{}",env.getProperty("server.port"));

    }

}
