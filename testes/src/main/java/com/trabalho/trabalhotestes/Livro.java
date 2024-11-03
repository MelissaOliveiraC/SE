package com.trabalho.trabalhotestes;

/**
 *
 * @author melissa
 */
public class Livro {
    Titulo titulo;
    
    public Livro(int codigo) {
        //instancia um titulo e o associa ao livro
        titulo = new Titulo(codigo);
    }
    
    public int verPrazo() {
            return titulo.getPrazo();
    }
}

