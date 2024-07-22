package atividade1;

import java.util.Scanner;

public class AtividadeI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long acumulador = 0L;

        System.out.println("Quantos Bilhetes classe A foram vendidos?");
        int classeA = input.nextInt();
        System.out.println("Quantos Bilhetes classe B foram vendidos?");
        int classeB = input.nextInt();
        System.out.println("Quantos Bilhetes classe C foram vendidos?");
        int classeC = input.nextInt();

        acumulador = classeA*50 + classeB*30+ classeC*20;

        System.out.println("A renda gerada pelas vendas dos ingressos foram: "+ acumulador + " R$");


        input.close();

    }
}
