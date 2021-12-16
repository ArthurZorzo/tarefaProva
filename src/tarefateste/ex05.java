/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefateste;

/**
 *
 * @author redzi
 */
public class ex05 {
    public static void main(String[] args) {
        double pedrinho = 1.50;
        double luiz = 1.30;
        int anoTotal = 0;
        
        while(pedrinho>=luiz){
            pedrinho += 0.02;
            luiz += 0.03;
            System.out.println("altura pedrinho: "+pedrinho);
            System.out.println("altura luiz: "+luiz);
            System.out.println("Anos: "+anoTotal);
            anoTotal += 2;
        }
        System.out.println("Quantidade de anos que demourou: "+anoTotal);
    }
}