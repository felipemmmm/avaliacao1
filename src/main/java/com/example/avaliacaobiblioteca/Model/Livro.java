package com.example.avaliacaobiblioteca.Model;

public class Livro {

    private int isbn;
    private String nomeLivro;
    private String autor;
    private String genero;

    Livro(){}
    Livro(int isbn, String nomeLivro, String autor, String genero){
        this.isbn = isbn;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.genero = genero;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
