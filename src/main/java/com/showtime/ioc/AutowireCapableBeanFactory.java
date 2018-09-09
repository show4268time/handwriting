package com.showtime.ioc;

/**
 * @program: handwriting-spring
 * @description: 自动装配bean工厂
 * @author: showtime
 * @create: 2018-09-09 10:05
 **/
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
