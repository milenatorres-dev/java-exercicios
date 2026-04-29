package org.Milena.exercicios.basicos;
/*Para que três lados formem um triângulo, a soma de dois lados deve ser maior que o
terceiro lado.
Crie um programa que receba três lados e exiba uma mensagem informando se
os lados podem formar um triângulo ou não.
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class Triangulo {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        if((lado1+lado2 >lado3) && (lado2+lado3 >lado1) && (lado1+lado3>lado2)){
            System.out.println("Os lados podem formar um triângulo");

        }else{
            System.out.println("Não é considerado um triângulo");
        }
    }
}
