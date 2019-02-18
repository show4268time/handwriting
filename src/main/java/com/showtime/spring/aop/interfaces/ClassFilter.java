package com.showtime.spring.aop.interfaces;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 类匹配
 * @author: yaoweihao
 * @date: 2018/11/12
 * @time: 15:33
 * @modified by:
 */
public interface ClassFilter {

    boolean matches(Class targetClass);
}
