package com.mycompany.cursoatividades;

public class Desconto {
    private int valorCompra;
    private double descontoPercentual = (double) 0.2;
    private int valorPago;

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public int calculoDesconto = (int) (valorCompra * descontoPercentual);

    public int getValorPago() {
        return (int) (valorCompra - calculoDesconto);
    }
    
}
