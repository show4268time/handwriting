package com.showtime.context;

import com.showtime.ioc.factory.AbstractBeanFactory;
import com.showtime.ioc.factory.BeanFactory;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/11/8
 * @time: 11:19
 * @modified by:
 */
public abstract class AbstractApplicationContext implements ApplicationContext{
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory){
        this.beanFactory = beanFactory;
    }

    public abstract void refresh() throws Exception;

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }
}
