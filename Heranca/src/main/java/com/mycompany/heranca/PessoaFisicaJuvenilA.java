package com.mycompany.heranca;

public class PessoaFisicaJuvenilA extends PessoaFisicaJuvenil {
    
    private final double beneficio = 1;
    
    public double calculaBeneficios() {
        return this.beneficio;
    }
    
    public double calculaBeneficios(double beneficio) {
        return this.beneficio + beneficio;
    }
    
    public double calculaBeneficios(String naoTem) {
        return 0.0;
    }
    
    public double calculaBeneficios(double beneficio, double beneficio02) {
        return this.beneficio + beneficio + beneficio02;
    }
}
