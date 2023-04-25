package com.chen.controller;

import com.chen.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * className:NumberController
 * author: chenqifan
 * date:2023/4/2020:18
 **/

@RestController
@RequestMapping("/number")
@CrossOrigin
public class NumberController {

    //123123

    @Autowired
    private NumberService numberService;

    @GetMapping("/yuyue")
    public String yuyue(){
        String str = numberService.update("内科", 2);
        return str;
    }
}
