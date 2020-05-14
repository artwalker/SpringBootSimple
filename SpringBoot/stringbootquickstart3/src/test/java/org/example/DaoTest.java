package org.example;

import org.example.dao.UserDao;
import org.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-05-14 21:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Stringbootquickstart3Application.class)
public class DaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        userDao.queryUserList().forEach(user -> System.out.println(user));
    }
}
