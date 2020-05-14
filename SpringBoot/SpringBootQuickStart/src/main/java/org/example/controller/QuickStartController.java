package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HackerStar
 * @create 2020-05-14 20:01
 */
@Controller
public class QuickStartController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "hello springboot";
    }
}
