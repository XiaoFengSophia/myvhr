package com.zxf.vhr.service;

import com.zxf.vhr.mapper.MenuMapper;
import com.zxf.vhr.model.Hr;
import com.zxf.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: MenuService
 * @Description: 菜单
 * @author: 赵晓峰
 * @date: 2022/7/16 5:22 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
@Service
public class MenuService {
    @Autowired(required = false)
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
