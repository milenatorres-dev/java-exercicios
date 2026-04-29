package org.Milena.exercicios.basicos;

/* Criar um programa que valide um código de acesso e um nível de permissão
para conceder ou não acesso para um usuário.
Condições:
** Um código de acesso numérico (o código correto é 2023).
** Um nível de permissão numérico (os níveis válidos são 1, 2 ou 3).
- Receber o código de acesso e o nível de permissão e exibir mensagem indicando se o acesso
foi permitido ou negado e informar o motivo caso o acesso seja negado.
 */

import java.util.Scanner;

public class PermissaoAcesso2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int codigoCorreto = 2023;
        int nivelMinimo = 1;
        int nivelMaximo = 3;

        System.out.println("Digite o código: ");
        int codigoDigitado = sc.nextInt();

        System.out.println("Digite o nível de acesso: ");
        int nivelDigitado = sc.nextInt();

        boolean codigoValido = codigoDigitado == codigoCorreto;
        boolean nivelValido = nivelDigitado>=nivelMinimo && nivelDigitado<=nivelMaximo;

        if(codigoValido && nivelValido){
            System.out.println("Acesso liberado");

        }else{
            System.out.println("Acesso negado. Motivos: ");
            if (!codigoValido){
                System.out.println("Código de acesso incorreto");
            }

            if(!nivelValido){
                System.out.println("Nível de permissão inválido");
            }
        }
    }
}
