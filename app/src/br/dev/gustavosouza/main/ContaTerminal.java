package br.dev.gustavosouza.main;

import java.util.Locale;
import java.util.Scanner;

import br.dev.gustavosouza.model.Cliente;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Exbir o nome, agencia, numero da agência e saldo do cliente

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Cliente cliente = new Cliente();

        String name = cliente.getName();
        int agencia = cliente.getNumeroAgencia();
        int conta = cliente.getNumeroConta();
        double saldo = cliente.getValor();
        System.out.println("\n ---------------------PREENCHA O FORMULÁRIO--------------------------\n");
        try {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();

            System.out.println("Digite sua agencia: ");
            agencia = scanner.nextInt();

            System.out.println("Digite seu numero da sua conta: ");
            conta = scanner.nextInt();

            System.out.println("Qual o valor que deseja depósitar? ");
            saldo = scanner.nextDouble();
            System.out.println("--------------------------------------------------------------------\n");
            System.out.println("Olá," + name + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia
                    + ", conta: " + conta + ", seu saldo: R$ " + saldo + ", já está disponível para saque.");
            System.out.println("\n --------------------------------------------------------------------");
        } finally {
            scanner.close();
        }

    }
}
