package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.domain.User;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-05-14 21:15
 */
@Mapper
public interface UserDao {
    public List<User> queryUserList();
}
