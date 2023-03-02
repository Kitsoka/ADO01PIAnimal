/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;





/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Pinto pinto1 = new Pinto();
        pinto1.setNome("Pinto");
        pinto1.setTamanho(9);
        pinto1.setLargura(7);
        
        Pinto pinto2= new Pinto("Pintao",16,12);
        
        System.out.println("===================================================");
        System.out.println("Imprimindo características do Pinto1:");
        pinto1.imprimir();
        
        System.out.println("Imprimindo características do Pinto2:");
        pinto2.imprimir();
        System.out.println("===================================================");
        
        System.out.println("===================================================");
        System.out.println("Crescendo os Pintos...\n");
        pinto1.crescer();
        pinto2.crescer();
       
        System.out.println("Imprimindo características do Pinto1 crescido:");
        pinto1.imprimir();
        System.out.println("Imprimindo características do Pinto2 crescido:");
        pinto2.imprimir();
        System.out.println("===================================================");
        
        System.out.println("===================================================");
        System.out.println("Transformando os Pintos...\n");
        pinto1.transformar();
        pinto2.transformar();
        
        System.out.println("Imprimindo características do Pinto1 transformado:");
        pinto1.imprimir();
        System.out.println("Imprimindo características do Pinto2 transformado:");
        pinto2.imprimir();
        System.out.println("===================================================");
        
        
        
        
    }

}
