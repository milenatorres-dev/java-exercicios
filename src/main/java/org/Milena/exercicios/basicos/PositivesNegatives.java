package org.Milena.exercicios.basicos;
/* criem um programa que permita **inserir vários números,
um por vez, e que pare quando o número "fim" for digitado.
 */
import java.util.Scanner;
public class PositivesNegatives {

    public static void main(String[] args){
        int positives = 0;
        int negatives = 0;
        int zero = 0;


        Scanner sc = new Scanner(System.in);


        while(true) {

            System.out.println("Type a number or 'end' to exit");
            String value = sc.nextLine().trim();

            if (value.equalsIgnoreCase("end")) {
                break;

            }

            try {

                int valorInt = Integer.parseInt(value);

                if (valorInt > 0) {
                    positives++;
                } else if (valorInt < 0) {
                    negatives++;

                } else {
                    zero++;
                }


            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please type a valid input or'end'");
            }

        }

        System.out.println("\nResults");
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Zeros: " + zero);

        sc.close();

    }
}
