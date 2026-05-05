package org.Milena.exercicios.basicos;
/* Escreva um programa que solicite uma senha e só libere acesso
se corresponder à senha correta. O usuário terá 3 tentativas de acertar a senha.
 */
import java.util.Scanner;
public class TentativasLogin {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234!T";
        for(int i = 0; i<3; i++){

            System.out.println("Input the correct password: ");
            String userInput = scanner.nextLine();

            if(userInput.equals(correctPassword)){
                System.out.println("Acess granted!");
                break;
            }

            System.out.println("Access denied!");
            System.out.println("You only have " + (2-i) + " attempts");
        }

        System.out.println("Account temporarily blocked");
        System.out.println("Try again in a fell minutes");

        scanner.close();
    }
}
