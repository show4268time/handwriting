package com.showtime.test;

import com.showtime.ioc.PropertyValue;
import com.showtime.ioc.PropertyValues;
import com.showtime.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.factory.BeanFactory;
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
    public void Test() throws Exception {
        //初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.showtime.ioc.HelloWorldService");
        PropertyValue propertyValue = new PropertyValue("text", "Hello World!");
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(propertyValue);
        beanDefinition.setPropertyValues(propertyValues);

        beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

        //获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
