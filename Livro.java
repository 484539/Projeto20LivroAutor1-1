/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String Titulo;
    private String Editora;
    private int ano;
    private Autor Escritor;

    public Livro() {
    }

    public Livro(String Titulo, String Editora, int ano) {
        this.Titulo = Titulo;
        this.Editora = Editora;
        this.ano = ano;
        //this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getEscritor() {
        return Escritor;
    }

    public void setEscritor(Autor Escritor) {
        this.Escritor = Escritor;
    }


    
    
}
