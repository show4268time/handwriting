package com.showtime.ioc;

/**
 * @program: handwriting-spring
 * @description: BeanFactory替换成接口
 * @author: showtime
 * @create: 2018-09-08 11:35
 **/
public interface BeanFactory {
    void  registerBeanDefinition(String name, BeanDefinition beanDefinition);

    Object getBean(String name);
}
