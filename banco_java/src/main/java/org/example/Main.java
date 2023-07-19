package org.example;
import org.example.model.ContaBanco;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite seu nome: ");
        String cliente = scanner.nextLine();

        System.out.print("Digite a sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        float saldo = random.nextInt(5000) + 1;

        ContaBanco novaconta = new ContaBanco(numero, cliente, agencia, saldo);

        scanner.close();

        System.out.println("Sua conta foi criada com sucesso! Seguem seus " +
                "dados:");
        novaconta.info();
    }
}