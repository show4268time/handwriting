package com.showtime.ioc;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/3
 * @time: 16:56
 * @modified by:
 */
public class BeanFactory {
    private ConcurrentHashMap<String, BeanDefinition> beanDefinitionConcurrentHashMap = new ConcurrentHashMap<String, BeanDefinition>();

    public void registerBeanDefinition(String name , BeanDefinition beanDefinition){
        beanDefinitionConcurrentHashMap.put(name, beanDefinition);
    }

    public Object getBean(String name){
        return beanDefinitionConcurrentHashMap.get(name);
    }
}
