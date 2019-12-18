package com.mxg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author matao
 * @create 2019-12-09 16:14
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
