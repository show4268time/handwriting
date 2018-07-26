package com.showtime.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @description:  包装一个对象所有的PropertyValue。
 * 为什么封装而不是直接用List?因为可以封装一些操作。
 * @author: yaoweihao
 * @date: 2018/7/26
 * @time: 20:31
 * @modified by:
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues(){

    }

    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
