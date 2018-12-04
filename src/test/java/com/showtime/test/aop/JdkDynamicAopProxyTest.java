package com.showtime.test.aop;

import com.showtime.spring.aop.AdvisedSupport;
import com.showtime.spring.aop.JdkDynamicAopProxy;
import com.showtime.spring.aop.TargetSource;
import com.showtime.spring.aop.TimerInterceptor;
import com.showtime.spring.context.ApplicationContext;
import com.showtime.spring.context.ClassPathXmlApplicationContext;
import com.showtime.spring.ioc.HelloWorldService;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/12/4
 * @time: 11:15
 * @modified by:
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception{
        // --------- helloWorldService without AOP
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();

        // --------- helloWorldService with AOP
        // 1. 设置被代理对象(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldService.class);
        advisedSupport.setTargetSource(targetSource);

        // 2. 设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3. 创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();

        // 4. 基于AOP的调用
        helloWorldServiceProxy.helloWorld();
    }
}
