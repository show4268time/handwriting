package com.showtime.aop;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 被代理的对象
 * @author: yaoweihao
 * @date: 2018/11/12
 * @time: 15:36
 * @modified by:
 */
public class TargetSource {
    private Class targetClass;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass){
        this.targetClass = targetClass;
        this.target = target;
    }

    public Class getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }
}
