package com.mycompany.heranca;

public class PessoaFisicaJuvenil extends PessoaFisica {
    private boolean restricao;
    
    public PessoaFisicaJuvenil() {
        this.restricao = true;
    }
    
    public boolean isRestricao() {
        return restricao;
    }

    @Override
    final public double getDesconto() {
        return 0.04;
    }
}
