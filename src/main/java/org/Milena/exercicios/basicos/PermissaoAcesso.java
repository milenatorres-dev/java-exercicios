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
public class PermissaoAcesso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigoCorreto = 2023;
        int[] nivelPermissao = {1, 2, 3};

        System.out.println("Digite o código de acesso: ");
        int codigoDigitado = sc.nextInt();

        System.out.println("Digite o nível de acesso: ");
        int nivelDigitado = sc.nextInt();

        boolean nivelValido = true;

        // Verificação do nível de permissão
        for (int i : nivelPermissao) {
            if (i == nivelDigitado) {
                nivelValido = false;
                break;
            }
        }

        if (codigoDigitado != codigoCorreto) {
            System.out.println("Acesso negado: código incorreto");

        } else if (nivelValido) {
            System.out.println("Acesso negado: Nível incorreto");

        } else {
            System.out.println("Acesso liberado");


        }
    }
}