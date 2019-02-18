package com.showtime.jdk.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * 使用JDK动态代理的五大步骤:
 * 1.通过实现InvocationHandler接口来自定义自己的InvocationHandler;
 * 2.通过Proxy.getProxyClass获得动态代理类
 * 3.通过反射机制获得代理类的构造方法，方法签名为getConstructor(InvocationHandler.class)
 * 4.通过构造函数获得代理对象并将自定义的InvocationHandler实例对象传为参数传入
 * 5.通过代理对象调用目标方法
 * @author: yaoweihao
 * @date: 2018/12/26
 * @time: 14:21
 * @modified by:
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        // 1、生成$Proxy0的class文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 2、获取动态代理类
        Class proxyClazz = Proxy.getProxyClass(UserDaoService.class.getClassLoader(),UserDaoService.class);
        // 3、获得代理类的构造函数，并传入参数类型InvocationHandler.class
        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
        // 4、通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
        UserDaoService userDaoService = (UserDaoService) constructor.newInstance(new UserLogHandler(new  UserDaoImpl()));
        // 5、通过代理对象调用目标方法
        userDaoService.findByUserName("showtime");

        // ==========================第二种=============================
        /**
         * Proxy类中还有个将2~4步骤封装好的简便方法来创建动态代理对象，
         *其方法签名为：newProxyInstance(ClassLoader loader,Class<?>[] instance, InvocationHandler h)
         */
        UserDaoService  userDaoService1 = (UserDaoService) Proxy.newProxyInstance(UserDaoService.class.getClassLoader(), // 加载接口的类加载器
                new Class[]{UserDaoService.class}, // 一组接口
                new UserLogHandler(new UserDaoImpl())); // 自定义的InvocationHandler
        userDaoService1.deleteByUserName("showtime");

    }
}
