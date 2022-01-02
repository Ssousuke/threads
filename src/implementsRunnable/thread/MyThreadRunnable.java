package implementsRunnable.thread;

public class MyThreadRunnable implements Runnable {
    private String name;
    private int time;

    public MyThreadRunnable(String name, int time) {
        this.name = name;
        this.time = time;
        // Thread t = new Thread(this);
        // t.start();
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
