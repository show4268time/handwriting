package com.showtime.ioc.service;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/3
 * @time: 16:56
 * @modified by:
 */
public class HelloWorldService {
    private String text;

    private OutputService outputService;

    public void helloWorld(){
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}