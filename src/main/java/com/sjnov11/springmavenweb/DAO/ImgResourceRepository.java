package com.sjnov11.springmavenweb.DAO;

import com.sjnov11.springmavenweb.domain.ImgResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImgResourceRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ImgResource> list() {
        String sql = "select * from img_resource";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<ImgResource>(ImgResource.class));
    }
}
