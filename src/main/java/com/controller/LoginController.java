/**
 * Copyright  2015  Pemass
 * All Right Reserved.
 */

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: LoginController
 * @Author: lin.shi
 * @CreateTime: 2015-12-27 21:38
 */
@Controller
public class LoginController {

    @RequestMapping(value = "index")
    public String welcome(){

        System.out.print("sdfsfsdfsd");
        return "jsp/index";
    }
}