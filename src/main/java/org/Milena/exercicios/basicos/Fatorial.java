package org.Milena.exercicios.basicos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        int fatorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial");
        int n = sc.nextInt();

        for(int i =1; i<=n; i++){
            fatorial = fatorial * i;
            //fatorial*=i;
        }
        System.out.println("O fatorial do número " + n + " é " + fatorial);
   }
}






