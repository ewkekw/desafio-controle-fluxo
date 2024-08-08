package org.ewkekw;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Defina o valor da primeira variável");
        int primeiroValor = scanner.nextInt();
        System.out.println("Defina o valor da segunda variável");
        int segundoValor = scanner.nextInt();

        try {
            contarParametros(primeiroValor, segundoValor);
        } catch (ArithmeticException e) {
            System.out.println("O valor da primeira variável deve ser menor que a segunda");
        }
    }

    static void contarParametros(int parametroUm, int parametroDois ) throws ArithmeticException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção]
        if (parametroUm > parametroDois) {
            throw new ArithmeticException("O primeiro valor deve ser menor que o segundo");
        }
        System.out.println("Iniciando contagem...");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("A contagem atual é: " + i);
        }
    }
}