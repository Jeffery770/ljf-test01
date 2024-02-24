package cn.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lujingfeng
 * @date 2024/2/24 10:27 上午
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
