package com.hzh.coachteam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("com.hzh.common.mapper")
@EnableSwagger2
@EnableWebMvc
public class ServiceCoacheteamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoacheteamApplication.class, args);
    }

}
