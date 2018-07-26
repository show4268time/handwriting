package com.showtime.ioc;

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

    public void helloWorld(){
        System.out.print(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
