package com.showtime.ioc;

/**
 * @program: handwriting-spring
 * @description: 处理bean之间的依赖
 * @author: showtime
 * @create: 2018-07-28 17:57
 **/
public class BeanReference {
    String name;

    Object bean;

    public BeanReference(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
