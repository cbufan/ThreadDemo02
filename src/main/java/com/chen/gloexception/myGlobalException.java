package com.chen.gloexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 * className:myGlobalException
 * author: chenqifan
 * date:2023/4/2021:20
 **/

@ControllerAdvice
@ResponseBody
public class myGlobalException {

    @ExceptionHandler({ArithmeticException.class})
    public String myException01(Exception e){
        String message = e.getMessage();
        System.out.println(message);
        return message;
    }
}
