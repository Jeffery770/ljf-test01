package cn.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lujingfeng
 * @date 2024/2/24 5:40 下午
 */
@Controller
public class HomeController {
    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "welcome";
    }
}