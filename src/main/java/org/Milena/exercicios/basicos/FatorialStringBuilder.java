package org.Milena.exercicios.basicos;

import java.util.Scanner;

public class FatorialStringBuilder {

    public static void main(String[] args){
        int fatorial = 1;
        StringBuilder processo = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial");
        int n = sc.nextInt();

        processo.append(n).append("! = ");

        for(int i = n; i >= 1; i--){
            processo.append(i);

            if(i > 1){
                processo.append(" x ");
            }

            fatorial *= i; //
        }

        processo.append(" = ").append(fatorial);

        System.out.println(processo);
    }
}