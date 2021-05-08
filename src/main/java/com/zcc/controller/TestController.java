package com.zcc.controller;

import com.zcc.common.lang.Result;
import com.zcc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zcc
 * @ClassName TestController
 * @description
 * @date 2021/5/8 18:47
 * @Version 1.0
 */
@RestController
public class TestController {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("/test")
    public Object test() {
        return Result.succ(sysUserService.list());
    }
}
