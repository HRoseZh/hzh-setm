package com.hzh.coachteam.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MP 分页物理插件
 *
 * @author Hou Zhonghu
 * @since 2022/3/22 10:51
 */
@Configuration
@MapperScan("com.hzh.common.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }

}
