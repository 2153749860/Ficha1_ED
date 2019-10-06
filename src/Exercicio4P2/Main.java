/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4P2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author tiago
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrdenedList<String> lista1 = new OrdenedList<>();
        
        String[] listaStrings = {"Tiago","Vitor","Joao"};
        
        lista1.adicionar(listaStrings);
        
        System.out.println(lista1.toString());
        
        //Solução
        ArrayList<String> al = new ArrayList<String>();
        al.add("bolaaaaaa");
        al.add("fixe");
        al.add("adeus");
        
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length()-s1.length();
            }
        } );

        System.out.println(al);
    }
    
}
