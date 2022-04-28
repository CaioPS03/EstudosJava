package com.mycompany.heranca;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double getDesconto() {
        return 0.20;
    }
    
    
}
