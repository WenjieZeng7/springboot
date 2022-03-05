package com.southwind.repository;

import com.southwind.entity.User;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-05 23:28
 */
public interface UserRepository {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
