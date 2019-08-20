package com.learn.javatest;

public class ThreadTest implements Runnable{
    public static void main(String[] args) {

        new MyThread().start();//创建并启动线程

        new Thread(new MyThread2()).start();

        new ThreadTest().run();

    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main ....");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("extends com.learn.thread to create com.learn.thread...");
    }
}
class MyThread2 implements Runnable{
    public void run() {
        System.out.println("impl runnable to create com.learn.thread...");
    }
}