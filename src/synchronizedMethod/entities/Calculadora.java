package synchronizedMethod.entities;

public class Calculadora {
    private int soma;

    // o método somaArray está sendo usado pelas duas threads
    // sendo assim é necessário usar o método syncronized para que cada thread
    // tenha acesso "individual" a soma.
    public synchronized int somaArray(int[] array) {
        soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            // Thread.currentThread().getName()
            // Pega a thread atual que está executando esse recurso
            System.out.println("Thread: " + Thread.currentThread().getName()
                    + ", somando o valor: " + array[i] + ", com o total de : " + soma
            );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
