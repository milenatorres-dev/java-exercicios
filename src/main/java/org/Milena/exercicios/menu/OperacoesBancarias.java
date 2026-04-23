package org.Milena.exercicios.menu;
import java.util.Scanner;
public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Milena Torres";
        String tipoConta = "Conta Corrente";
        double saldo = 5000;
        int opcao = 0;

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial da conta: " + saldo);

        while (opcao != 4) {
            System.out.println("Escolha uma opção no menu de operações:");
            System.out.println("Opção 1: Consultar saldos");
            System.out.println("Opção 2: Receber valor");
            System.out.println("Opção 3: Transferir valor");
            System.out.println("Opção 4: Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.println("O salto atual da conta é: " + saldo);
                    break;
                }

                case 2 -> {
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = sc.nextDouble();

                    saldo = saldo + valor;
                    System.out.println("O seu saldo atual é de : " + saldo );
                    break;
                }

                case 3->{
                    System.out.println("Digite o valor que você quer transferir: ");
                    double valor = sc.nextDouble();

                    saldo = saldo - valor;
                    System.out.println("O seu saldo atual é de: " + saldo);
                    break;
                }

                case 4->{
                    System.out.println("Operação encerrada");
                    break;
                }

                default -> System.out.println("Operação inválida. Digite uma opção válida");
            }
        }
    }
}
