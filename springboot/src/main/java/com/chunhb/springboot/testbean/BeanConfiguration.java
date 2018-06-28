package com.chunhb.springboot.testbean;

import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfiguration {

    @Bean
    @Profile(value = "prod")
    public Runnable test_pro(){

System.out.println("test_pro");
        return() -> {};
    }

    @Bean
    @Profile(value = "dev")
    public Runnable test_dev(){

        System.out.println("test_dev");
        return() -> {};
    }


    @Bean
    @Profile(value = "test")
    public Runnable test_test(){
        System.out.println("test_test");
        return() -> {};
    }
}
