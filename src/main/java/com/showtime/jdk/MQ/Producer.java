package com.showtime.jdk.MQ;

import java.util.concurrent.BlockingDeque;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2019/1/25
 * @time: 12:55
 * @modified by:
 */
public class Producer implements Runnable{
    private volatile boolean isRunning = true;

    private BlockingDeque<Integer> blockingDeque;


    public Producer(BlockingDeque<Integer> blockingDeque){
        this.blockingDeque = blockingDeque;
    }
    @Override
    public void run() {

    }
}
