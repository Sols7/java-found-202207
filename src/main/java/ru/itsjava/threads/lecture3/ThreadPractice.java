package ru.itsjava.threads.lecture3;

import lombok.SneakyThrows;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        synchronized (obj) {
            obj.notify();
        }

//        ThreadPractice threadPractice = new ThreadPractice();
//        MyThread thread1 = new MyThread(1, threadPractice);
//        MyThread thread2 = new MyThread(2, threadPractice);
//        MyThread thread3 = new MyThread(3, threadPractice);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        Thread.currentThread().join();
    }

    @SneakyThrows
    public synchronized void printNun(int num) {
        //synchronized (this) {
            System.out.println("Begin" + num);
            this.wait(1000);
            System.out.println("End" + num);
        //}
    }

}