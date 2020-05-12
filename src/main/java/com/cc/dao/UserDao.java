package com.cc.dao;

import com.cc.domain.User;

import java.util.List;

public interface UserDao {
    /**
    *@Description 查询所有记录
    *@param
    *@return User的list集合
    *@Author cc
    *@Date 2020/5/10
    *@time 20:02
    */
    List<User> findAll();

    /**
    *@Description 根据id查询用户
    *@param id 用户id
    *@return 指定用户
    *@Author cc
    *@Date 2020/5/10
    *@time 20:53
    */
    User selectById(int id);

    /**
     * @param user 用户
     * @return
     * @Description 添加用户
     * @Author cc
     * @Date 2020/5/10
     * @time 21:09
     */
    void saveUser(User user);
}
