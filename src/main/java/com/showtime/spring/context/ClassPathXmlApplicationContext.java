package com.showtime.spring.context;

import com.showtime.spring.ioc.BeanDefinition;
import com.showtime.spring.ioc.factory.AbstractBeanFactory;
import com.showtime.spring.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.spring.ioc.io.ResourceLoader;
import com.showtime.spring.ioc.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/11/8
 * @time: 15:05
 * @modified by:
 */
public class ClassPathXmlApplicationContext extends  AbstractApplicationContext{

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for(Map.Entry<String, BeanDefinition> map : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(map.getKey(), map.getValue());
        }
    }

}
