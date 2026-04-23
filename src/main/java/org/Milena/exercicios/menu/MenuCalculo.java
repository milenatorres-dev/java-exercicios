package org.Milena.exercicios.menu;
import java.util.Scanner;


/*Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado" e "2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

public class MenuCalculo {

    public static double areaQuadrado(double lado){
        double areaQuadrado= lado * lado;
        return areaQuadrado;
    }

    public static double areaCirculo(double raio){
        double pi = 3.1415;
        double areaCirculo = pi * raio * raio;
        return areaCirculo;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:");
        System.out.println("Opção 1 - Cálcular a área do quadrado");
        System.out.println("Opção 2 - Calcular a área do círculo");
        int opcao = sc.nextInt();

        switch(opcao){

            case 1:
                System.out.println("Informe o valor do lado do quadrado: ");
                int valor1 = sc.nextInt();
                double areaQuadrado = areaQuadrado(valor1);

                System.out.println("A área calculada do quadrado é: " + areaQuadrado);

                break;


            case 2:
                System.out.println("Informe o valor do raio para calcular a área do círculo");
                double raio = sc.nextDouble();

                double areaCirculo = areaCirculo(raio);
                System.out.println("A área calculada do círculo é:" + areaCirculo);

                break;

            default:
                System.out.println("Por favor escolha uma opção válida para o cálculo");
        }

    }
}
