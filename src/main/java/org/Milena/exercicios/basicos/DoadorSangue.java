package org.Milena.exercicios.basicos;
import java.util.Scanner;
/* Verificar se uma pessoa pode ser doadora de sangue ou não conforme as condições abaixo:
**Ter entre 18 e 65 anos.
**Pesar mais de 50 kg.
 */

public class DoadorSangue {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        System.out.println("Informe o peso corporal: ");
        double peso = sc.nextDouble();

        if(idade >= 18 && idade <= 65 && peso>50){
            System.out.println("A pessoa pode ser doadora de sangue");

        }else{
            System.out.println("A pessoa não pode ser doadora de sangue");
        }


    }

}
