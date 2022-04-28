package com.mycompany.heranca;

public class PessoaEstrangeira extends Pessoa{
    private String numeroPassaporte;

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    @Override
    public double getDesconto() {
        return 0.0;
    }
}
