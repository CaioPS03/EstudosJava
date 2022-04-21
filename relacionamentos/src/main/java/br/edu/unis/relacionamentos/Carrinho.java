package br.edu.unis.relacionamentos;


public class Carrinho {
    private Produtos item;

    public Carrinho(Produtos item) {
        this.item = item;
    }

    public Produtos getItem() {
        return item;
    }

    public void setItem(Produtos item) {
        this.item = item;
    }
    
}
