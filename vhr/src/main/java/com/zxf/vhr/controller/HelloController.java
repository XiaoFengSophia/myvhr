package com.zxf.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: 测试类
 * @author: 赵晓峰
 * @date: 2022/7/14 8:13 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }
}
