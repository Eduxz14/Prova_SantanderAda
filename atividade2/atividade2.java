package atividade2;

import java.util.Scanner;

public class atividade2 {

    private static double converterTemperatura(double temperatura, char entrada, char converter) {
        if (entrada == 'C' && converter == 'F') {
            return (temperatura * 9 / 5) + 32;
        } else if (entrada == 'C' && converter == 'K') {
            return temperatura + 273.15;
        } else if (entrada == 'F' && converter == 'C') {
            return (temperatura - 32) * 5 / 9;
        } else if (entrada == 'F' && converter == 'K') {
            return (temperatura - 32) * 5 / 9 + 273.15;
        } else if (entrada == 'K' && converter == 'C') {
            return temperatura - 273.15;
        } else if (entrada == 'K' && converter == 'F') {
            return (temperatura - 273.15) * 9 / 5 + 32;
        } else {
            return temperatura;
        }
    }

    public static void main(String[] args) {
        double temperatura, temperaturaEntrada, C, F, K;
        char entrada, converter;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAtividade 2 Santader Coders\n");

        System.out.println("Por favor digite a temperatura:");
        temperatura = sc.nextDouble();

        temperaturaEntrada = temperatura;

        do {
            System.out.println(
                    "\nPor favor digite uma unidade de  origem da temperatura\nSendo C para grau Celsius, K para Kelvin ou F para grau Fahrenheit:");
            entrada = sc.next().charAt(0);

            if (entrada != 'C' && entrada != 'F' && entrada != 'K') {
                System.out.println("\nEntrada invalida!!\n");
            }
        } while (entrada != 'C' && entrada != 'F' && entrada != 'K');

        do {
            System.out.println("\nPara qual unidade voce quer converter?");
            converter = sc.next().charAt(0);

            if (converter != 'C' && converter != 'F' && converter != 'K') {
                System.out.println("\nEntrada invalida!!\n\n");
            }
        } while (converter != 'C' && converter != 'F' && converter != 'K');

        temperatura = converterTemperatura(temperatura, entrada, converter);
        System.out.println("\nA temperatura de entrada foi " + temperaturaEntrada + entrada);
        System.out.println("A temperatura convertida é:" + temperatura + converter );

        sc.close();
    }

}
