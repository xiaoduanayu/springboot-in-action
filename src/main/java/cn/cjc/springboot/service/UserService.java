package cn.cjc.springboot.service;

import cn.cjc.springboot.domain.User;

import java.util.List;

/**
 * @author debo
 * @date 2020-05-05
 */
public interface UserService {

    void addUser(User user);

    List<User> findAll();
}
