package com.showtime.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/3
 * @time: 16:54
 * @modified by:
 */
public class BeanDefinition {
    private Object object;

    public BeanDefinition(Object object){
        this.object = object;
    }

    public Object getBean(){
        return object;
    }
}
