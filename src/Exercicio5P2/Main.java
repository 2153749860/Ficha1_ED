/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5P2;

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
        
        //Instanciação da livraria
        Libraria<Media> loja = new Libraria<>();
        
        //Instanciação de items
        Video video1 = new Video(120, "Tiago");
        Livro livro1 = new Livro( 500, "Joao");
        CD cd1 = new CD(10, "Vitor");
        
        //Adição de items à libraria
        loja.add(video1);
        loja.add(livro1);
        loja.add(cd1);
        
        //Printar items
        System.out.println("Teste Items Adicionados: \n" + loja.toString());
        
        //Obter Item
        System.out.println(loja.obterIndex(2));
        System.out.println(loja.obterIndex(0) + "\n");
        
        //Remover Items da Livraria
        loja.removerItem(livro1);
        loja.removerIndex(1);
        
        //Printar Items
        System.out.println("Teste Items Removidos: \n" + loja.toString());
        
        
        
    }
    
}
