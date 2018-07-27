package com.showtime.ioc;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 17:20
 * @modified by:
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
