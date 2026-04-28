package org.Milena.exercicios.basicos;

/*Você está planejando uma viagem de carro e deseja calcular quantos quilômetros poderá percorrer com o combustível disponível no tanque. Para isso, você precisa considerar:
• O consumo médio do veículo (km/l)
• A capacidade total do tanque de combustível (litros)
• A quantidade de combustível disponível no momento (litros)
• A distância da viagem planejada (km)
Com essas informações, o programa deverá calcular:
• A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
• A autonomia atual, baseada na quantidade de combustível disponível.
• Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.
• Quantos litros de combustível será necessário para completar a viagem;

 */


import java.util.Scanner;

public class AutonomiaVeiculo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o consumo médio do veículo em Km/litro: ");
        double consumoMedio = sc.nextDouble();

        if(consumoMedio<=0){
            System.out.println("Consumo médio inválido");
            return;
        }

        System.out.println("Informe a capacidade máxima do tanque de combustível em litros: ");
        double capacidadeTanque = sc.nextDouble();

        System.out.println("Informe a quantidade do combustível atual em litros: ");
        double combustivelAtual = sc.nextDouble();

        System.out.println("Informe a distância da viagem em km: ");
        double distanciaViagem = sc.nextDouble();

        double autonomiaMax = autonomiaMaxima(consumoMedio, capacidadeTanque);
        System.out.println("A autonomia máxima do seu veículo é de " + autonomiaMax + "Km");

        double autonomiaAtual = autonomiaAtual(consumoMedio, combustivelAtual);
        System.out.println("A autonomia atual do seu veículo é de " + autonomiaAtual + "Km");


        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você tem combustível suficiente para realizar a viagem.");
        } else {
            double falta = distanciaViagem - autonomiaAtual;
            System.out.println("Você NÃO tem combustível suficiente.");
            System.out.println("Faltam " + falta + " km de autonomia.");
        }

        double litrosNecessarios = litrosNecessarios(distanciaViagem, consumoMedio);

        System.out.printf("Para percorrer essa distância, você precisará de  %.2f litros de combustivel"
                        , litrosNecessarios);

        double combustivelFaltante = litrosFaltantes(litrosNecessarios, combustivelAtual);

        if(combustivelFaltante>0){
            System.out.printf("\nVocê precisa abastecer %.2f litros.", combustivelFaltante);
        }else{
            System.out.println("\nVocê já tem combustível suficiente");
        }


    }

    public static double autonomiaMaxima(double consumoMedio, double capacidadeTanque){

        return consumoMedio * capacidadeTanque;

    }

    public static double autonomiaAtual(double consumoMedio, double combustivelAtual){

        return consumoMedio * combustivelAtual;

    }

    public static double litrosNecessarios(double distancia, double consumoMedio) {

        return distancia / consumoMedio;
    }

    public static double litrosFaltantes( double litrosNecessarios, double combustivelAtual){

        double faltante = litrosNecessarios - combustivelAtual;
        return Math.max(faltante, 0);

    }

}
