package com.showtime.test.context;

import com.showtime.spring.context.ApplicationContext;
import com.showtime.spring.context.ClassPathXmlApplicationContext;
import com.showtime.spring.ioc.HelloWorldService;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/11/8
 * @time: 15:28
 * @modified by:
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
