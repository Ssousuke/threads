package implementsRunnable.application;

import implementsRunnable.thread.MyThreadRunnable;

public class Test04 {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("Thread #01", 500);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread #02", 500);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread #03", 500);


        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        // Espera a execução das threads para imprimir a mensagem final
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Programa Finalizado!");
    }
}
