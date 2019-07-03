package com.bos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author study
 * @create 2019-07-03 20:03
 */
@Controller
@RequestMapping("/index")
public class UserController {

    @ResponseBody
    @RequestMapping("/test")
    public String test()
    {
        return "1111111x";
    }
}
