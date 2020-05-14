package org.example.controller;

import org.example.dao.UserDao;
import org.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-05-14 21:19
 */
@Controller
public class DaoController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser() {
        List<User> users = userDao.queryUserList();
        return users;
    }
}
