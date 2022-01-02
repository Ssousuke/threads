package introduction.extendsThread.thread;

public class MyThread extends Thread {
    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ", " + i);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("A thread " + name + " terminou a execução.");
        }
    }
}
