package com.showtime.ioc.factory;

import com.showtime.ioc.BeanDefinition;

public abstract class  AbstractBeanFactory implements BeanFactory{
    @Override
    public Object getBean(String className) {
        return null;
    }

    @Override
    public void registerBeanDefinition(String className, BeanDefinition beanDefinition) {

    }
}
