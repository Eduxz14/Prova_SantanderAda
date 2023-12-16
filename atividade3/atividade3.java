package atividade3;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        int tamanhoTriangulo, linha, coluna;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAtividade 3 Santader Coders\n");

        System.out.println("Indique um número inteiro positivo:");
        tamanhoTriangulo = sc.nextInt();

        char[][] matriz = new char[tamanhoTriangulo][tamanhoTriangulo];

        sc.close();

        for (linha = 0; linha < tamanhoTriangulo; linha++) {
            for (coluna = 0; coluna < tamanhoTriangulo - linha - 1; coluna++) {
                System.out.print(" ");
            }

            for (coluna = 0; coluna <= linha; coluna++) {
                matriz[linha][coluna] = '*';
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println("");
            

        }

    }
}
