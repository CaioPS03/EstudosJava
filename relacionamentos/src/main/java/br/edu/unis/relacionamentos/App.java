package br.edu.unis.relacionamentos;

public class App {

    public static void main(String[] args) {
        Produtos p1 = new Produtos(1, "Produto 1", (float) 5.4, 19);
        Carrinho c1 = new Carrinho(p1);
        Revista r1 = new Revista(9, "Vita", "Notícias");
    }
    
}
