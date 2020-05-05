package cn.cjc.springboot.service.impl;

import cn.cjc.springboot.domain.User;
import cn.cjc.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author debo
 * @date 2020-05-05
 */
@Service
public class UserServiceImpl implements UserService {
    private List<User> userList = new ArrayList<>();

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public List<User> findAll() {
        return userList;
    }
}
