package com.showtime.jdk;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 交替打印
 * @author: yaoweihao
 * @date: 2019/1/25
 * @time: 11:12
 * @modified by:
 */
public class AlternatePrinting {
    private int times;
    private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);

    public AlternatePrinting(int times){
        this.times = times;
    }

    private void print(String name, Semaphore current, Semaphore next) throws InterruptedException {
        for (int i = 1; i < times; i++){
            current.acquire();
            System.out.print(name);
            next.release();
        }
    }

    private void printA() throws InterruptedException {
        print("A", semaphoreA, semaphoreB);
    }

    private void printB() throws InterruptedException {
        print("B", semaphoreB, semaphoreC);
    }

    private void printC() throws InterruptedException {
        print("C", semaphoreC, semaphoreA);
    }

    public static void main(String[] args){
        AlternatePrinting alternatePrinting = new AlternatePrinting(10);

        new Thread().start();
    }
}
