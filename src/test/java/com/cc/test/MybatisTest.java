package com.cc.test;

import com.cc.dao.UserDao;
import com.cc.domain.User;
import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao mapper;

    /**
    *@Description 初始化操作
    *@param
    *@return
    *@Author cc
    *@Date 2020/5/10
    *@time 21:04
    */
    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        sqlSession = factory.openSession(true);
        mapper = sqlSession.getMapper(UserDao.class);
    }


    @Test
    public void testFindAll(){

        List<User> list = mapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }

    }

    @Test
    public void testSelectById() {
        User user = mapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setGender("男");
        user.setName("大猩猩");
        user.setScore(73.4);
        mapper.saveUser(user);
    }
    /**
    *@Description 释放资源操作
    *@param
    *@return void
    *@Author cc
    *@Date 2020/5/10
    *@time 21:04
    */
    @After
    public void destory() throws IOException {
        sqlSession.close();
        in.close();
    }
}
