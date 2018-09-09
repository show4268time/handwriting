package com.showtime.ioc;

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
public abstract class AbstractBeanFactory implements BeanFactory{
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(name, beanDefinition);
    }


    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public abstract Object doCreateBean(BeanDefinition beanDefinition);
}
