package com.mycompany.cursoatividades;

public class Desconto {
    private double valorCompra;
    private double descontoPercentual;
    private double valorPago;

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }
    
    //  Percentual de desconto é transformado em número decimal
    public double valorDescontado() {
        return this.descontoPercentual / 100;
    }
    
    //  Calculo de quanto será descontado do valor total da compra
    public double calculoDesconto() {
        double desconto = this.valorCompra * this.valorDescontado();
        return desconto;
    }
    
    //  Calculo do valor a ser pago
    public double getValorPago() {
        return valorCompra - calculoDesconto();
    }
    
}
