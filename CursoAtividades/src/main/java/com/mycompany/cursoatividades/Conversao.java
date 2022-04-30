package com.mycompany.cursoatividades;

public class Conversao {
    private double valorEmReais;
    private double valorEmDolar = 4.97;

    public void setValorEmReais(double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    public double valorConvertido() {
        return this.valorEmReais / this.valorEmDolar;
    }
}
