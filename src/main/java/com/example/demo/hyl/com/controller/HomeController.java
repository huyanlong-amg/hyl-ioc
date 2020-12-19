package com.example.demo.hyl.com.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    private static Log logger = LogFactory.getLog(HomeController.class);


    @RequestMapping("/")
    public String getStr(Model model) {
        logger.info("getStr, start ... ");
        model.addAttribute("msg", "谢谢观看");
        return "hello word";
    }
}
