package edu.dio.bank;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe sua agência (xxx-x): ");
        String agencia = scanner.next();

        System.out.println("Favor informar seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        String resposta = "Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.";

        System.out.println(resposta);

    }
}
