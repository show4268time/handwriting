package com.showtime.context;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.factory.AbstractBeanFactory;
import com.showtime.ioc.factory.AutowireCapableBeanFactory;
import com.showtime.ioc.io.ResourceLoader;
import com.showtime.ioc.xml.XmlBeanDefinitionReader;

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
