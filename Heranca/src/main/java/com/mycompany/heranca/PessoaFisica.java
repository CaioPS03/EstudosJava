package com.mycompany.heranca;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void nomeECidade() {
        System.out.println(this.nome +this.cpf);
    }

    @Override
    public double getDesconto() {
        return 0.05;
    }
}
