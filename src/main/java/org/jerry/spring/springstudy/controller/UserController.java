package org.jerry.spring.springstudy.controller;

import org.jerry.spring.springstudy.DAO.UserMapper;
import org.jerry.spring.springstudy.DTO.User;
import org.jerry.spring.springstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhuqianchao
 * @date 1/11/2020 14:33
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @GetMapping(value = "/{userName}")
    public List<User> selectById(@PathVariable String userName) {
        return userMapper.findByUserName(userName);
    }

    @PostMapping(value = "/add")
    public String add(@RequestBody User user) {
        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "SUCCESS";
    }

}
