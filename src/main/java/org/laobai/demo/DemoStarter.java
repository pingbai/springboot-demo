package org.laobai.demo;

import org.laobai.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// 当前类是启动类
@SpringBootApplication
public class DemoStarter {

    public static void main(String[] args) {
        SpringApplication.run(DemoStarter.class,args);
    }

    @Bean
    public User user(){
        return new User();
    }

}
