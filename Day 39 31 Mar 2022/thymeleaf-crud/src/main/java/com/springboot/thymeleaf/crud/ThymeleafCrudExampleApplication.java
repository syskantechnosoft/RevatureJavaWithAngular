package com.springboot.thymeleaf.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.thymeleaf.crud.domain.entities.Role;
import com.springboot.thymeleaf.crud.domain.entities.UserInfo;
import com.springboot.thymeleaf.crud.domain.repositories.UserInfoRepository;

@SpringBootApplication
public class ThymeleafCrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafCrudExampleApplication.class, args);
    }
}
