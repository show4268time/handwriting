package com.showtime.spring.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/12/4
 * @time: 11:28
 * @modified by:
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    private String text;

    private OutputService outputService;
    @Override
    public void helloWorld() {
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
