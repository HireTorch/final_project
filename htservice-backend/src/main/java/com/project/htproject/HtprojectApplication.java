package com.project.htproject;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)/*(exclude = {DataSourceAutoConfiguration.class})*/
public class HtprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtprojectApplication.class, args);
	}
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}

}
