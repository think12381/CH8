package com.example.ch8.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EnableJpaRepositories(repositoryFactoryBeanClass = CustomRepositoryFactoryBean.class)

public class Application {

	@Autowired
	PersonRepository1 personRepository1;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
