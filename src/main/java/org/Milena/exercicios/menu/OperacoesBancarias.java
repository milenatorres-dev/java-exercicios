package org.Milena.exercicios.menu;
import java.util.Scanner;
public class OperacoesBancarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Milena Torres";
        String tipoConta = "Conta Corrente";
        double saldo = 5000;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial da conta: " + saldo);
        System.out.println("\n************************************");

        String menu = """
               **Escolha uma opção no menu de operações**
                 Opção 1: Consultar saldos
                 Opção 2: Receber valor
                 Opção 3: Transferir valor
                 Opção 4: Sair
               """;

        while (opcao != 4) {
            System.out.println("\n" + menu);

            opcao = sc.nextInt();

            switch (opcao) {

                case 1 -> {
                    System.out.println("O salto atual da conta é: " + saldo);
                }

                case 2 -> {
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = sc.nextDouble();

                    saldo = saldo + valor;
                    System.out.println("O seu saldo atual é de : " + saldo );
                }

                case 3->{
                    System.out.println("Digite o valor que você quer transferir: ");
                    double valor = sc.nextDouble();

                     if(valor>saldo){
                         System.out.println("Saldo insuficiente para transferência");
                         System.out.println("O seu saldo atual é de : " + saldo );

                         break;
                     }

                    saldo = saldo - valor;
                    System.out.println("O seu saldo atual é de: " + saldo);
                }

                case 4->{
                    System.out.println("Operação encerrada");
                }

                default -> System.out.println("Operação inválida. Digite uma opção válida");
            }
        }
    }
}
