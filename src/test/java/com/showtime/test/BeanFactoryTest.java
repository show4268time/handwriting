package com.showtime.test;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.BeanFactory;
import com.showtime.ioc.HelloWorldService;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/9/7
 * @time: 16:19
 * @modified by:
 */
public class BeanFactoryTest {

    @Test
    public void Test() {
        //初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        //获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
