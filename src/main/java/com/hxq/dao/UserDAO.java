package com.hxq.dao;

import com.hxq.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper//用来创建dao对象
public interface UserDAO {

    void save(User user);

    User findByUserName(String username);
}
