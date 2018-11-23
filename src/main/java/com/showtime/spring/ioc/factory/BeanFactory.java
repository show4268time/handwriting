package com.showtime.spring.ioc.factory;

/**
 * @program: handwriting
 * @description: BeanFactory替换成接口
 * @author: showtime
 * @create: 2018-09-08 11:35
 **/
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
