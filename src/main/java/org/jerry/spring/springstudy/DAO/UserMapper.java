package org.jerry.spring.springstudy.DAO;

import org.apache.ibatis.annotations.*;
import org.jerry.spring.springstudy.DTO.User;

import java.util.List;

/**
 * @author zhuqianchao
 * @date 1/11/2020 14:29
 */
@Mapper
public interface UserMapper {

    @Select("select * from tb_users where user_name like concat(#{userName}, '%')")
    @Results(value = {
            @Result(property = "userName", column = "user_name"),
            @Result(property = "scores", column = "scores")
    })
    List<User> findByUserName(String userName);

    @Insert("insert into tb_users (user_name, scores) values (#{userName}, #{scores})")
    void add(User user);
}
