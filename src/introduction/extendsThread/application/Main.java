package introduction.extendsThread.application;

import introduction.extendsThread.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread #01", 100);
        MyThread thread2 = new MyThread("Thread #02", 300);
        MyThread thread3 = new MyThread("Thread #03", 900);
        MyThread thread4 = new MyThread("Thread #04", 200);
    }
}
