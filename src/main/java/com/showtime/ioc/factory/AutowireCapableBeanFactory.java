package com.showtime.ioc.factory;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @program: handwriting-spring
 * @description: 自动装配bean工厂
 * @author: showtime
 * @create: 2018-09-09 10:05
 **/
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        this.applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field field = bean.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            field.set(bean, propertyValue.getValue());
        }
    }
}
