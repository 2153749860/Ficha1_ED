/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4P2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tiago
 */
public class OrdenedList<T> {
    ArrayList<T> ordem = new ArrayList<T>();

    public OrdenedList() {
    }
    
    public void adicionar(T[] lista) {
        for(int i=0; i<lista.length; i++){
            ordem.add(lista[i]);
        }
        
    }

    @Override
    public String toString() {
        return "OrdenedList{" + "ordem=" + ordem + '}';
    }
    
    
}

