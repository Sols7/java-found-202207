package ru.itsjava.threads.lecture1;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 1_000_000_000; j++) {
//                for (int k = 0; k < 10; k++) {
//                }
//            }
//            System.out.println("A");
//        }

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(2000L);
//            System.out.println("A");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//        }

        PrinterThread printerThreadA = new PrinterThread("A", 1000L);
//        PrinterThread printerThreadB = new PrinterThread("B", 1500L);
        PrinterRunnable printerRunnable = new PrinterRunnable("B", 1500L);
        Thread threadB = new Thread(printerRunnable);

        System.out.println("START");
        printerThreadA.start();
        threadB.start();

        printerThreadA.join();
        threadB.join();
        System.out.println();
        System.out.println("END");
    }
}
