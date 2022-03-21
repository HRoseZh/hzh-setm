package com.hzh.coachteam.swagger;

import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Swagger UI
 *
 * @author Hou Zhonghu
 * @since 2022/3/21 9:23
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
public class SwaggerConfig {
    @Value("${swagger.enable}")
    private boolean enable;

    @Bean
    public Docket getUserDocket(){
        //API 描述信息
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("体育赛事售票管理系统1.0接口")
                .contact(
                        new Contact(
                                "体育赛事售票管理系统",
                                "hhhhhhh.com",
                                "Hrose@97163.com"
                        )
                )
                .description("Hzh Sports-ticketing-management-system API")
                .version("1.0")//版本号
                .build();

        //基本配置
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .enable(enable)
                .apiInfo(apiInfo)//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.hzh.coachteam"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }

}
