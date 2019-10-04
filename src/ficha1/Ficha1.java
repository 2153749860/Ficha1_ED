/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha1;

/**
 *
 * @author tiago
 */
public class Ficha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TwoTypePair<String, Integer> teste1 = new TwoTypePair<>("Tiago", 20);
        TwoTypePair<String, Integer> teste2 = new TwoTypePair<>("Tiago", 20);
        TwoTypePair<String, Integer> teste3 = new TwoTypePair<>("Vitor", 20);
        
        //Teste printar objetos de teste1
        System.out.println(teste1.getFirst());
        System.out.println(teste1.getSecond());
        
        //teste comparar se objetos sao iguais
        System.out.println(teste1.equals(teste2));
        
        //teste comparar se objetos nao sao iguais
        System.out.println(teste1.equals(teste3));
    }
    
}
