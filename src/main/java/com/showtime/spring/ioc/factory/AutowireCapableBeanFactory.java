package com.showtime.spring.ioc.factory;

import com.showtime.spring.ioc.BeanDefinition;
import com.showtime.spring.ioc.BeanReference;
import com.showtime.spring.ioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @program: handwriting
 * @description: 自动装配bean工厂
 * @author: showtime
 * @create: 2018-09-09 10:05
 **/
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    public Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        beanDefinition.setBean(bean);
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
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                Object reference = getBean(beanReference.getName());
                field.set(bean, reference);
            } else {
                field.set(bean, value);
            }
        }
    }
}
