package com.sjnov11.springmavenweb.DAO;

import com.sjnov11.springmavenweb.domain.ImgPath;
import com.sjnov11.springmavenweb.domain.ImgResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ImgPathRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<ImgPath> getImgPathList(int fk) {
        String sql = "select * from img_path where fk =" + fk;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<ImgPath>(ImgPath.class));
    }
}
