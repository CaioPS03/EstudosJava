package com.mycompany.cursoatividades;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*  Codigo Dobro
        System.out.println("Digite o numero: ");
        Dobro dobro = new Dobro();
        dobro.setNumero(in.nextInt());
        System.out.println("O resultado e " + dobro.getDobro());
        */
        /*  Codigo Comissao
        System.out.println("Digite o numero de vendas: ");
        Comissao comissao = new Comissao();
        comissao.setTotalVendas(in.nextInt());
        System.out.println("A comissao e de " + comissao.getComissao());
        */
        /*  Codigo Area
        System.out.println("Digite a largura: ");
        Area area = new Area();
        area.setLargura(in.nextInt());
        System.out.println("Digite o comprimento: ");
        area.setComprimento(in.nextInt());
        System.out.println("A area e de " + area.getArea() + " metros quadrados");
        */
        System.out.println("Digite o valor da compra: ");
        Desconto desconto = new Desconto();
        desconto.setValorCompra(in.nextInt());
        System.out.println("O valor a ser pago e: " + desconto.getValorPago());
    }
    
}
