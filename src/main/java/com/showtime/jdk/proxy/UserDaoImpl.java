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
public class UserDaoImpl implements UserDaoService{
    public void findByUserName(String name) {
        System.out.println("查询名称为" + name + "的用户信息成功！");
    }

    public void deleteByUserName(String name) {
        System.out.println("删除名称为" + name + "的用户信息成功！");
    }
}
