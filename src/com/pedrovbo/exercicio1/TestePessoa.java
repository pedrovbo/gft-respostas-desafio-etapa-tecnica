package com.pedrovbo.exercicio1;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setDataNascimento(1989, 3, 30);

        p.calculaIdade();

        System.out.println(p.getDataNascimento());
    }
}
