package com.showtime.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/12/26
 * @time: 14:17
 * @modified by:
 */
public class UserLogHandler implements InvocationHandler {
    //目标对象
    private Object target;

    public UserLogHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(target, args);
        afterInvoke();
        return result;
    }

    //记录方法调用时间
    public void beforeInvoke(){
        GregorianCalendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间：" + time);
    }

    public void afterInvoke(){
        System.out.println("方法调用结束！" );
    }
}
