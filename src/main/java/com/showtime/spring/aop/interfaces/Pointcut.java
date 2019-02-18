package com.showtime.spring.aop.interfaces;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 切面
 * @author: yaoweihao
 * @date: 2019/2/14
 * @time: 15:29
 * @modified by:
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
