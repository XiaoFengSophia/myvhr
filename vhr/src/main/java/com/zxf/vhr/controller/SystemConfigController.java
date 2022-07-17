package com.zxf.vhr.controller;

import com.zxf.vhr.model.Menu;
import com.zxf.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: SystemConfigController
 * @Description: 系统配置
 * @author: 赵晓峰
 * @date: 2022/7/16 5:19 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenusByHrId(){

        return menuService.getMenusByHrId();
    }
}
