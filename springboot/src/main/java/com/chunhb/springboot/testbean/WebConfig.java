package com.chunhb.springboot.testbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class WebConfig {


    @Value("${ds.userName}")
    private String userName;

    @Autowired
    public Environment environment;


    public void show(){
        System.out.println("ds.userName="+this.userName);

        System.out.println("environment="+this.environment.getProperty("ds.password"));

    }


}
