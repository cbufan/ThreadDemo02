package com.chen.test;

import com.chen.service.NumberService;
import com.chen.utils.ApplicationContextUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * description:
 * className:ThreadTest
 * author: chenqifan
 * date:2023/4/2111:02
 **/

@SpringBootTest
public class ThreadTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testThread() throws ExecutionException, InterruptedException {
        NumberGet numberGet = new NumberGet();

        for(int i=0;i<10;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    applicationContext = ApplicationContextUtils.getApplicationContext();
                    NumberService numberService = applicationContext.getBean(NumberService.class);
                    while(true){
                        System.out.println(Thread.currentThread().getName());
                        String num = numberService.update("内科", 2);
                        System.out.println(Thread.currentThread().getName()+":【"+num+"】");
                    }
                }
            });
            thread.start();
        }
}


class NumberGet implements Runnable {

    private ApplicationContext applicationContext;


    @Override
    public void run() {

        }
    }
}