package com.showtime.ioc.factory;

import com.showtime.ioc.BeanDefinition;

public interface BeanFactory {
    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
