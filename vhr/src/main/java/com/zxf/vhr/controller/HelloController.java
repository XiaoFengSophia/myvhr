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
    @GetMapping("/employee/basic/hello2")
    public String hello2(){

        return "employee/basic/hello2";
    }
    @GetMapping("/employee/advanced/hello3")
    public String hello3(){

        return "employee/advanced/hello3";
    }
}
