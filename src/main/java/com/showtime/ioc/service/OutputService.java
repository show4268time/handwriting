package com.showtime.ioc.service;


import org.junit.Assert;

/**
 * @program: handwriting-spring
 * @description:
 * @author: showtime
 * @create: 2018-07-28 18:02
 **/
public class OutputService {
    public HelloWorldService helloWorldService;

    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
