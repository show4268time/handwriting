package com.showtime.spring.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 用于bean的属性注入
 * @author: yaoweihao
 * @date: 2018/9/29
 * @time: 15:41
 * @modified by:
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
