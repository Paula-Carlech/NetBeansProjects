package Atividade9;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String info(){
        return "-------Livro------- \n" + "Título: " + titulo + "\n" + "Autor: " + autor + "\n" + "Disponível ? " + disponivel;
    }
}