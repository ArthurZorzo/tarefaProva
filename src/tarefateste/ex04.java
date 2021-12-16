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
public class ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numPessoas;
        int cont = 0;
        double valorTotalDetran = 0;
        int valorMulta = 0;
        int numCarteira[];
        int qntdMulta[];
        int valorTotal[];
        
        numCarteira = new int[2];//Professor eu coloquei 3 para não ser um vetor mt grande mas poderia ser 3235
        qntdMulta = new int[2];
        valorTotal = new int[2];
        
        System.out.println("Quantas pessoas serão cadastradas no sistema: ");
        numPessoas = leia.nextInt();
        
        while(cont < numPessoas){
            valorTotal[cont] = 0;
            
            System.out.println("Digite o numero da carteira: ");
            numCarteira[cont] = leia.nextInt();
            if((numCarteira[cont] > 3235) || (numCarteira[cont] <= 0)){
                System.out.println("Numero de cartei ra Invalido");
                while((numCarteira[cont] > 3235) || (numCarteira[cont] <= 0)){
                    System.out.println("Digite o numero da carteira");
                    numCarteira[cont] = leia.nextInt();
                }
            }
            
            System.out.println("Quantidade de multas em sua carteira: ");
            qntdMulta[cont] = leia.nextInt();
                        
            for(int i = 0; i < qntdMulta[cont]; i++){
                System.out.println("Digite o valor da multa: ");
                valorMulta = leia.nextInt();
                valorTotal[cont] = valorTotal[cont] + valorMulta;
            }
            valorTotalDetran = valorTotalDetran + valorTotal[cont];
            System.out.println("Numero da Carteira: "+numCarteira[cont]);
            System.out.println("Quantidade de multas: "+qntdMulta[cont]);
            System.out.println("Valor total a se pagar: "+valorTotal[cont]);
            System.out.println("Valor total do detran: "+valorTotalDetran);
            cont++;
        }
    }
}
