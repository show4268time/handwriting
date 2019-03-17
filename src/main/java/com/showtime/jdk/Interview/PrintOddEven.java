package com.showtime.jdk.Interview;

/**
 * @program: handwriting-spring
 * @description: 交替打印奇偶数
 * @author: showtime
 * @create: 2019-03-17 10:42
 **/
public class PrintOddEven {
    public static Object lock = new Object();
    public static int count = 1;

    static class printOdd implements Runnable{

        @Override
        public void run() {
            while (count <= 10){
                synchronized (lock){
                    if(count % 2 == 1){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.print("printOdd:" + count);
                        count++;
                        lock.notify();
                    }
                }
            }

        }
    }

    static class printEven implements Runnable{

        @Override
        public void run() {
            while (count <= 10){
                synchronized (lock){
                    if(count % 2 == 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.print("printEven:" + count);
                        count++;
                        lock.notify();
                    }
                }
            }

        }
    }

    public static void main(String[] args){
        new Thread(new printEven()).start();
        new Thread(new printOdd()).start();
    }
}
