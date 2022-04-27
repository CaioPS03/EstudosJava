package com.mycompany.cursoatividades;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        Dobro dobro = new Dobro();
        dobro.numero = in.nextInt();
        //dobro.numero = 3;
        System.out.println("O resultado e " + dobro.dobro);
    }
    
}
