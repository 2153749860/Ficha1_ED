/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5P2;

import java.util.ArrayList;


/**
 *
 * @author tiago
 */
public class Libraria <T extends Media>{
    ArrayList<T> lista = new ArrayList<>();

    public Libraria() {
    }
            
    public void add(T item){
        lista.add(item);
    }
    
    public void removerItem(T item){
        lista.remove(item);
    }
    
    public void removerIndex(int index){
        lista.remove(index);
    }
    
    public T obterIndex(int index){
        return lista.get(index);
    }

    @Override
    public String toString() {
        return "Libraria{" + "lista=" + lista + '}';
    }
    
    
    
}
