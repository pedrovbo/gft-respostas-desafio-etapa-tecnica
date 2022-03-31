package com.pedrovbo.exercicio3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char escolha;
        int litros;
        double total = 0, valorSuco = 10;


        System.out.println("Qual suco você deseja? \nL-limão - R$ 10,00 \nT-tamarindo - R$ 10,00");
        escolha = in.next().toUpperCase().charAt(0);
        System.out.println("Quantos litros você deseja? ");
        litros = in.nextInt();

        if (escolha == 'L' && litros <= 2) {
            total = (litros * valorSuco) * 0.97;
        } else if (escolha == 'L' && litros > 5) {
            total = (litros * valorSuco) * 0.95;
        } else if (escolha == 'T' && litros <= 2) {
            total = (litros * valorSuco) * 0.96;
        } else if (escolha == 'T' && litros > 5) {
            total = (litros * valorSuco) * 0.94;
        } else {
            total = litros * valorSuco;
        }

        System.out.println("Valor a ser pago pelo cliente R$ " + total);

        in.close();

    }


}
