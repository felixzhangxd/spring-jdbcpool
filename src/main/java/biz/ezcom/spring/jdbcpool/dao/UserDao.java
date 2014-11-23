package biz.ezcom.spring.jdbcpool.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import biz.ezcom.spring.jdbcpool.po.User;

@Repository
public class UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public User find(Integer id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, ParameterizedBeanPropertyRowMapper.newInstance(User.class));
    }
}
