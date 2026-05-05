package org.Milena.exercicios.basicos;
import java.util.Scanner;
public class ValidName {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name = "";
        do{
            System.out.println("Type a valid name: ");
             name = sc.nextLine().trim();

             if(name.length()<3){
                 System.out.println("Invalid name.It must contain more than 3 characters.\n");
             }
        }
        while(name.length()<3);


        System.out.println("Name successfully registered.");

        sc.close();
    }


}
