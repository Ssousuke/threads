package synchronizedMethod.application;

import synchronizedMethod.entities.thread.MinhaThreadSoma;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MinhaThreadSoma t1 = new MinhaThreadSoma("Thread #1", array);
        MinhaThreadSoma t2 = new MinhaThreadSoma("Thread #2", array);

    }
}
