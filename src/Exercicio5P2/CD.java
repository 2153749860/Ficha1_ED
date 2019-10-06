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
public class CD extends Media{
    private int faixas;

    public CD(int faixas, String autor) {
        super(autor);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "\nCD: " + " Autor: " + getAutor() + " Faixas: " + faixas;
    }
    
    
    
}
