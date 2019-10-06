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
public class Video extends Media{
    private int duracao;

    public Video(int duracao, String autor) {
        super(autor);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    
    
    @Override
    public String toString() {
        return "\nVideo:" + " Autor: " + getAutor() + " Duração: " + duracao;
    }
    
    
}
