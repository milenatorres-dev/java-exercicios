package org.Milena.exercicios.basicos;
/*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas e imprima no console o valor
convertido de Celsius para Fahrenheit.

Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é:
(temperatura * 1.8) + 32.

Depois de finalizar, testar e conferir que seu programa foi executado com sucesso,
crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
Lembre-se que provavelmente você precisará fazer um casting de valores.*/

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Cº: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " +  fahrenheit);



        // Escreva o mesmo programa usando String.format().
        String mensagem = String.format("A temperatura de %.1f Celsius para Fahrenheit é: %.1f " ,celsius ,fahrenheit);
        System.out.println(mensagem);


        // Faça o Casting do resultado de double para int.
        int castingFahrenheit = (int) fahrenheit;
        String mensagemInteira = String.format("O resultado Fahrenheit inteiro é: %d", castingFahrenheit);
        System.out.println(mensagemInteira);
    }
}



