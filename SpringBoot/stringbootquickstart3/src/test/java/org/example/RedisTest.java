package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Repository.UserRepository;
import org.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author HackerStar
 * @create 2020-05-14 22:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Stringbootquickstart3Application.class)
public class RedisTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() throws Exception {
        //从redis缓存中获得指定的数据
        String userListData = redisTemplate.boundValueOps("user.findAll").get();
        //如果redis中没有数据的话
        if(userListData == null) {
            //查询数据库获得数据
            List<User> all = userRepository.findAll();
            //转换成json格式字符串
            ObjectMapper objectMapper = new ObjectMapper();
            userListData = objectMapper.writeValueAsString(all);
            //将数据存储到redis中，下次再查询从redis中获得数据，不用再查询数据库
            redisTemplate.boundValueOps("user.findAll").set(userListData);
            System.out.println("---------------------从数据库获得数据---------------------");
        } else {
            System.out.println("---------------------从redis缓存中获得数据---------------------");
        }

        System.out.println(userListData);
    }
}
