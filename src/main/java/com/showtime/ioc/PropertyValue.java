package com.showtime.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 用于bean的属性注入
 * @author: yaoweihao
 * @date: 2018/7/26
 * @time: 20:25
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