package com.pedrovbo.exercicio4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.println("Precisamos verificar se você pode doar sangue.");
        System.out.print("Digite sua idade: ");
        idade = in.nextInt();

        if (idade >= 18 && idade <= 67){
            System.out.println("Você pode doar sangue!");
        } else if (idade < 18){
            System.out.println("Você precisa completar 18 anos para doar sangue!");
        } else{
            System.out.println("Você está acima do limite de idade para doar sangue!");
        }


            in.close();
    }
}
