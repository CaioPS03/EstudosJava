package com.mycompany.heranca;

public class Loja {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setId(1);
        pf.setNome("Cliente 01");
        pf.setLogradouro("Rua XPTO, 1024");
        pf.setBairro("Jardim Aeroporto");
        pf.setCidade("Varginha");
        pf.setUf("MG");
        pf.setCpf("033.333.444-52");
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(2);
        pj.setNome("Cliente Empresa 01");
        pj.setLogradouro("Rua XPTO, 1024 B");
        pj.setBairro("Jardim Aeroporto");
        pj.setCidade("Alfenas");
        pj.setUf("MG");
        pj.setCnpj("25.122.122/0001-85");
        
        PessoaFisicaJuvenil pfj = new PessoaFisicaJuvenil ();
        pfj.setNome("De menor");
        pfj.setCpf("111.111.111-11");
        
        PessoaFisicaJuvenilA pfja = new PessoaFisicaJuvenilA();
        
        System.out.println("Desconto: " + pf.getDesconto());
        System.out.println("Desconto: " + pj.getDesconto());
        System.out.println("Beneficio: " + pfja.calculaBeneficios(1));
        System.out.println("Beneficio: " + pfja.calculaBeneficios("nsao tem"));
        System.out.println("Beneficio: " + pfja.calculaBeneficios(1, 1));
    } 
}
