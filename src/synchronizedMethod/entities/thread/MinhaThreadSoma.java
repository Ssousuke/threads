package synchronizedMethod.entities.thread;

import synchronizedMethod.entities.Calculadora;

public class MinhaThreadSoma implements Runnable {
    private String nome;
    private int[] numS;

    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, int[] numS) {
        this.nome = nome;
        this.numS = numS;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada!");
        int soma = calculadora.somaArray(this.numS);
        System.out.println("Resultado: " + soma);
        System.out.println(this.nome + " finalizada!");
    }
}
