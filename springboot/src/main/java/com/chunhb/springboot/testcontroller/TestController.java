package com.chunhb.springboot.testcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping(value = "testString")
    public String testString(){
        return "test";
    }

    @GetMapping(value = "testJson")
    public String testJson(){

        logger.info("info","atestjson_info");
        logger.error("error","atestjson_error");
        
        return "json";
    }

}
