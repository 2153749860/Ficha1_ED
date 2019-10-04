/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.scene.effect.Light.Point;

/**
 *
 * @author tiago
 */
public class Exercicio2 {

    static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pair<Integer> teste1 = new Pair(1, 2);
        Pair<Integer> teste2 = new Pair(3, 2);
        Pair<Integer> teste3 = new Pair(2, 2);
        Pair<Integer> teste4 = new Pair(2, 2);

        //testes maior vs menor
        System.out.println(teste1.max());
        System.out.println(teste2.max());
        System.out.println(teste3.max());

        //testes iguais ou diferentes
        System.out.println(teste1.equals(teste2));
        System.out.println(teste3.equals(teste4));

        //teste iguais de ordem trocada
        UnorderedPair<Integer> teste5 = new UnorderedPair<>(1, 2);
        UnorderedPair<Integer> teste6 = new UnorderedPair<>(2, 1);
        UnorderedPair<Integer> teste7 = new UnorderedPair<>(2, 2);

        System.out.println(teste5.equals(teste6));

        //teste valores da mesma classe sao iguais ou nao
        System.out.println(teste5.getFirst());
        System.out.println(teste5.getSecond());

        System.out.println(teste5.equalElements());
        System.out.println(teste7.equalElements());

        //Criação de uma Colection e adicao de elementos
        List<Integer> stones = new ArrayList<>();

        stones.add(1);
        stones.add(2);
        stones.add(3);
        stones.add(4);

        //teste printar elementos da collection
        printCollection(stones);

        //Exercicio 5
        //public void drawAll(List<? extends Shape>
        
        //Parte 2
        
        //Exercicio 1
        //a) classe genérica
        //b) classe / tipo parametrizado
        //d) genérica
        
        //Exercicio 2
        //da
        //nao da
        //nao da
        
        //Exercicio 3
        /*
        ArrayList<Point> a = new ArrayList<Point>();
        ArrayList<Object> b;
        b = a;
        b.add(new Point(10, 20));
        */
        //Os tipos não são compativeis
    }

}
