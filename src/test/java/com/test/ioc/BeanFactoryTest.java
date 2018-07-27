package com.test.ioc;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.HelloWorldService;
import com.showtime.ioc.PropertyValue;
import com.showtime.ioc.PropertyValues;
import com.showtime.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.ioc.factory.BeanFactory;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 15:56
 * @modified by:
 */
public class BeanFactoryTest {
    @Test
    public void test() throws Exception {
        //初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //生成bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setClassName("com.showtime.ioc.HelloWorldService");

        // 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        //注入bean
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloService");
        helloWorldService.helloWorld();
    }
}
