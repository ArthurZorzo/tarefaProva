/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefateste;

import java.util.Scanner;

/**
 *
 * @author redzi
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double qw;
        double salario = 1045;
        double qwH;
        double total;
        double desconto;
        
        System.out.println("Digite a quantidade de qw gasto: ");
        qw = leia.nextInt();
        
        qwH = (salario/5);
        
        total = qwH * qw;
        System.out.println("Total a ser pago: "+total);
        
        desconto = (total*17)/100;
        System.out.println("Total a ser pago com desconto: "+desconto);
        
        System.out.println("Custo de cada qw: "+qwH);
    }
    
}
