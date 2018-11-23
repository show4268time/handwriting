package com.showtime.test;

import com.showtime.spring.ioc.factory.AbstractBeanFactory;
import com.showtime.spring.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.spring.ioc.BeanDefinition;
import com.showtime.spring.ioc.HelloWorldService;
import com.showtime.spring.ioc.io.ResourceLoader;
import com.showtime.spring.ioc.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

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

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> entry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(entry.getKey(), entry.getValue());
        }

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
