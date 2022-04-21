package br.edu.unis.relacionamentos;

public class Revista {
    private int codigo;
    private String titulo;
    private String tipo;
    private Edicao edicao;

    public Revista(int codigo, String titulo, String tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tipo = tipo;
        this.edicao = new Edicao(7, "10 de Abril", 12);
    }
    
}
