package com.showtime.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.beans.MethodDescriptor;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 代理相关的元数据
 * @author: yaoweihao
 * @date: 2018/11/12
 * @time: 15:42
 * @modified by:
 */
public class AdvisedSupport {
    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }
}
