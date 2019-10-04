/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author tiago
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pair<Integer> teste1 = new Pair(1,2);
        Pair<Integer> teste2 = new Pair(3,2);
        Pair<Integer> teste3 = new Pair(2,2);
        Pair<Integer> teste4 = new Pair(2,2);
        
        //testes maior vs menor
        System.out.println(teste1.max());
        System.out.println(teste2.max());
        System.out.println(teste3.max());
        
        //testes iguais ou diferentes
        System.out.println(teste1.equals(teste2));
        System.out.println(teste3.equals(teste4));
        
        //teste iguais de ordem trocada
        UnorderedPair<Integer> teste5 = new UnorderedPair<>(1,2);
        UnorderedPair<Integer> teste6 = new UnorderedPair<>(2,1);
        
        System.out.println(teste5.equals(teste6));
        
    }
    
}
