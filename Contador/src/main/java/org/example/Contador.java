package org.example;
import org.example.exceptions.ParametrosInvalidosException;
import org.example.Util;
import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        Util util = new Util();

        Scanner terminal = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Insira o segundo número: ");
        int parametroDois = terminal.nextInt();

        try{
            util.contar(parametroUm, parametroDois);
        } catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }


    }
}