package com.test.ioc;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.HelloWorldService;
import com.showtime.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.ioc.factory.BeanFactory;
import org.junit.Test;

public class BeanFactoryTest {
    @Test
    public void test(){
        //初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClassName("com.showtime.ioc.HelloWorldService");
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloService");
        helloWorldService.helloWorld();
    }
}
