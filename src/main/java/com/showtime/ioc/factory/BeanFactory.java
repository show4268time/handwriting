package com.showtime.ioc.factory;

import com.showtime.ioc.BeanDefinition;

/**
 * @program: handwriting-spring
 * @description: BeanFactory替换成接口
 * @author: showtime
 * @create: 2018-09-08 11:35
 **/
public interface BeanFactory {
    void  registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

    Object getBean(String name);
}