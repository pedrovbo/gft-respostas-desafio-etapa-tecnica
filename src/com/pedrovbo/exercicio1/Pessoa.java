package com.pedrovbo.exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    public void calculaIdade(){
        int idade = Period.between(this.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println("A idade da pessoa é: " + idade + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int ano, int mes, int dia) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", altura=" + altura +
                '}';
    }
}
