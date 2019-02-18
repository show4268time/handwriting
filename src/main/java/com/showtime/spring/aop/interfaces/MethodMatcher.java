package com.showtime.spring.aop.interfaces;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 方法匹配
 * @author: yaoweihao
 * @date: 2019/2/14
 * @time: 15:24
 * @modified by:
 */
public interface MethodMatcher {
    boolean matches(Method method, Class targetClass);
}
