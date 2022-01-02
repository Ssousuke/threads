package implementsRunnable.application;

import implementsRunnable.thread.MyThreadRunnable;

public class Test {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("Thread #01", 100);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread #02", 300);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread #03", 900);
        MyThreadRunnable thread4 = new MyThreadRunnable("Thread #04", 200);

    }
}
