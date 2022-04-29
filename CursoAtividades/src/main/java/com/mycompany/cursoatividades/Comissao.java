package com.mycompany.cursoatividades;

public class Comissao {
    private int totalVendas;
    private int comissao;

    public int getComissao() {
        return (int) (totalVendas * 0.1);
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    
}
