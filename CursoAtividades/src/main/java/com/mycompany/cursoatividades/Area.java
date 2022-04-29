package com.mycompany.cursoatividades;

public class Area {
    private int comprimento;
    private int largura;
    private int area;

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getArea() {
        return (int) (largura * comprimento);
    }
    
}
