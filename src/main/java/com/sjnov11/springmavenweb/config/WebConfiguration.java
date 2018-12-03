package com.sjnov11.springmavenweb.config;

import com.sjnov11.springmavenweb.DAO.ImgResourceRepository;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

public class WebConfiguration {
    @Resource
    Environment env;

    @Bean
    public JdbcTemplate jdbcTemplate(){
        BasicDataSource source = new BasicDataSource();
        source.setDriverClassName(env.getProperty("spring.datasource.driverClassName"));
        source.setUrl(env.getProperty("spring.datasource.url"));
        source.setUsername("spring.datasource.username");
        source.setPassword("spring.datasource.password");
        // DB INFO

        return new JdbcTemplate(source);
    }

}
