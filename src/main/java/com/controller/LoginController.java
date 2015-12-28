/**
 * Copyright  2015  Pemass
 * All Right Reserved.
 */

package com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Description: LoginController
 * @Author: lin.shi
 * @CreateTime: 2015-12-27 21:38
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    Logger logger = org.apache.log4j.Logger.getLogger(LoginController.class);
    @RequestMapping(value = "/index")
    public String welcome(){
        logger.debug("into LoginController................................");
        System.out.print("sdfsfsdfsd");
        return "jsp/index";
    }
}