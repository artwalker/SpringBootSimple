package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HackerStar
 * @create 2020-05-14 20:42
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class QucikStart2Controller {

    private String name;
    private Integer age;

    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        return "name:" + name + "," + "age:" + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
