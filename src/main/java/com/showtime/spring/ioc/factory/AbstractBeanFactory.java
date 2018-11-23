package com.showtime.spring.ioc.factory;

import com.showtime.spring.ioc.BeanDefinition;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/9/7
 * @time: 16:02
 * @modified by:
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {

        beanDefinitionMap.put(name, beanDefinition);
    }


    public Object getBean(String name) throws Exception {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        Assert.assertTrue(beanDefinition != null);
        Object bean = beanDefinition.getBean();
        if(bean == null){
            bean = doCreateBean(beanDefinition);
        }

        return bean;
    }

    public abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
