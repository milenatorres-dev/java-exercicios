package org.Milena.exercicios.jogos;
import java.util.Random;
import java.util.Scanner;
public class JogoAdvinhacao {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numberRandom = random.nextInt(100);


        /* A instância da classe Random também pode ser feita criando um objeto anônimo,
        se não houver a necessidade de criar mais de um numero aleatório em momentos diferentes no código:
        int number Random = new Random.nextInt(100);*/

        for(int i=0; i<5; i++){

            System.out.println("Digite um número");
            int valorUsuario = sc.nextInt();

            if(valorUsuario<numberRandom){
                System.out.println("O número digitado é menor que o valor de referência, tente novamente");
                }

            else if(valorUsuario>numberRandom){
                System.out.println("O número digitado é maior que o valor de referência, tente novamente");
            }

            else if(valorUsuario==numberRandom){
                System.out.println("Parabéns, você acertou");
                break;
            }

        }





    }


}





