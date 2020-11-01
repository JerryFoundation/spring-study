package org.jerry.spring.springstudy.service;

import org.jerry.spring.springstudy.DAO.UserMapper;
import org.jerry.spring.springstudy.DTO.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhuqianchao
 * @date 1/11/2020 15:24
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) {
        userMapper.add(user);

        int i = 1/0;
    }
}
