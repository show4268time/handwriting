package com.showtime.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 从配置中读取BeanDefinitionReader
 * @author: yaoweihao
 * @date: 2018/11/5
 * @time: 18:38
 * @modified by:
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
