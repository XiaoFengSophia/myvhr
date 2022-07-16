package com.zxf.vhr.service;

import com.zxf.vhr.mapper.HrMapper;
import com.zxf.vhr.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @ClassName: HrService
 * @Description: HrService
 * @author: 赵晓峰
 * @date: 2022/7/14 7:58 下午
 * @Blog: https://blog.csdn.net/Websphere_zxf
 */
@Service
public class HrService implements UserDetailsService {

    @Autowired(required = false)
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Hr hr = hrMapper.loadUserByUsername(username);
        if(hr == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
}
