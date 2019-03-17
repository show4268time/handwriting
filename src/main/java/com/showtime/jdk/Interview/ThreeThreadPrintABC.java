package com.showtime.jdk.Interview;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: handwriting-spring
 * @description: 交替打印ABC
 * @author: showtime
 * @create: 2019-03-17 11:08
 **/
public class ThreeThreadPrintABC {
    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();
    private static int count = 1;

    static class printA implements Runnable{

        @Override
        public void run() {
            while (count <= 10){
                lock.lock();
                if(count % 3 == 1){
                    System.out.print("printA: " + "A");
                    count++;
                    condition.signalAll();
                }else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            }
        }
    }

    static class printB implements Runnable{

        @Override
        public void run() {
            while (count <= 10){
                lock.lock();
                if(count % 3 == 2){
                    System.out.print("printB: " + "B");
                    count++;
                    condition.signalAll();
                }else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            }
        }
    }

    static class printC implements Runnable{

        @Override
        public void run() {
            while (count <= 10){
                lock.lock();
                if(count % 3 == 0){
                    System.out.print("printC: " + "C");
                    count++;
                    condition.signalAll();
                }else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        lock.unlock();
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        new Thread(new printA()).start();
        new Thread(new printB()).start();
        new Thread(new printC()).start();
    }
}
