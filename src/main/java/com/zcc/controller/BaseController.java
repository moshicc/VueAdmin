package com.zcc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zcc
 * @ClassName BaseController
 * @description
 * @date 2021/5/8 18:42
 * @Version 1.0
 */

public class BaseController {
    @Autowired
    HttpServletRequest req;

}
