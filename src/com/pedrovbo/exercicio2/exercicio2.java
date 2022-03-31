package com.pedrovbo.exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char escolha;
        System.out.println("Em que turno você trabalha? ");
        System.out.println("M - Matutino\nV-Vespertino\nN-Noturno");
        escolha = in.next().toUpperCase().charAt(0);

        switch (escolha){
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde");
                break;
            case 'N':
                System.out.println("Boa Noite");
                break;
            default:
                System.out.println("Valor inválido");

        }

        in.close();


    }
}
