package com.cloudthat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveUser(String username, String emailId,String phoneNumber ){
        String sql = "INSERT INTO User(username,emailId,phoneNumber) VALUES(?,?,?)";
        jdbcTemplate.update(sql,username,emailId,phoneNumber);
    }

    public User getUserById(int id){
        String sql = "SELECT id, username, emailId, phoneNumber FROM User WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),id);
    }


}
