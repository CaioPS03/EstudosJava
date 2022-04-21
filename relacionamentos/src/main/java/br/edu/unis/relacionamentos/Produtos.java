package br.edu.unis.relacionamentos;

public class Produtos {
    private int cogigo;
    private String descricao;
    private float preco;
    private int quantidade;

    public Produtos(int cogigo, String descricao, float preco, int quantidade) {
        this.cogigo = cogigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public int getCogigo() {
        return cogigo;
    }

    public void setCogigo(int cogigo) {
        this.cogigo = cogigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    
}
