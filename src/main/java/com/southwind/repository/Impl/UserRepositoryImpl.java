package com.southwind.repository.Impl;

import com.mysql.cj.jdbc.JdbcConnection;
import com.southwind.entity.User;
import com.southwind.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 23:28
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<>(User.class));
    }//注意new BeanPropertyRowMapper<>(User.class),通过此对象，把结果集映射成实体类。

    @Override
    public User findById(long id) {
        return jdbcTemplate.queryForObject("select * from user where id = ?",new Object[]{id},
                new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user(id,name,score) values(?,?,?)",
                user.getId(),user.getName(),user.getScore());
    }

    @Override
    public void update(User user) {
        jdbcTemplate.update("update user set name = ?,score = ? where id = ?",
                user.getName(),user.getScore(),user.getId());
    }

    @Override
    public void deleteById(long id) {
        jdbcTemplate.update("delete from user where id = ?",id);
    }
}
