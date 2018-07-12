package com.showtime.ioc.factory;

import com.showtime.ioc.BeanDefinition;

public interface BeanFactory {
    Object getBean(String className);

    void registerBeanDefinition(String className, BeanDefinition beanDefinition);
}
