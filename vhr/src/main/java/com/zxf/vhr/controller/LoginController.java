package com.zxf.vhr.controller;

import com.zxf.vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LoginController
 * @Description: 登录
 * @author: 赵晓峰
 * @date: 2022/7/14 9:08 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login(){

        return RespBean.error("尚未登录，请登录！");
    }
}
