package com.showtime.jdk.proxy;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/12/26
 * @time: 14:16
 * @modified by:
 */
public interface UserDaoService {
    void findByUserName(String name);

    void deleteByUserName(String name);
}
