package com.showtime.test.aop;


import com.showtime.spring.aop.AspectJExpressionPointcut;
import com.showtime.spring.ioc.HelloWorldService;
import com.showtime.spring.ioc.HelloWorldServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2019/2/14
 * @time: 16:54
 * @modified by:
 */
public class PointCutTest {

    @Test
    public void testClassFilter() throws Exception{
        String expression = "execution(* com.showtime.spring.ioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* com.showtime.spring.ioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceImpl.class);
        Assert.assertTrue(matches);
    }
}
