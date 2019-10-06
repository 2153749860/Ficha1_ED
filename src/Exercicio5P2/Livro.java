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
public class Livro extends Media{
    private int paginas;

    public Livro(int paginas, String autor) {
        super(autor);
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "\nLivro:" + " Autor: " + getAutor() + " Paginas: " + paginas;
    }
    
    
}
