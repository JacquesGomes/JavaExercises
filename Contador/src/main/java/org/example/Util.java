package org.example;
import org.example.exceptions.ParametrosInvalidosException;

public class Util {
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if (contagem < 0) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}