package implementsRunnable.application;

import implementsRunnable.thread.MyThreadRunnable;

public class Test02 {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("Thread #01", 500);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread #02", 500);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread #03", 500);
        MyThreadRunnable thread4 = new MyThreadRunnable("Thread #04", 500);


        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        Thread t4 = new Thread(thread4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        for (int i = 0; i <  27; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Programa Finalizado!");
    }
}
