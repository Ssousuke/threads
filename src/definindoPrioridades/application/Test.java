package definindoPrioridades.application;

import definindoPrioridades.thread.MyThreadRunnable;

public class Test {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("Thread #01", 500);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread #02", 500);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread #03", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        // setPriority tem um nivel de prioridade que vai de 1 até 10
        // t1.setPriority(5);
        // t2.setPriority(1);
        // t3.setPriority(3);

        // O setPriority tambem possui constantes que definem a prioridade
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
