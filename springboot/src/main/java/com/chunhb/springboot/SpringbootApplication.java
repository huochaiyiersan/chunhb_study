package com.chunhb.springboot;

import com.chunhb.springboot.testbean.DataSourceProperties;
import com.chunhb.springboot.testbean.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		context.getBean(WebConfig.class).show();

		context.getBean(DataSourceProperties.class).show();
	}
}
