package Atividade9;

public class principal {

    public static void main(String args[]) {
        
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Paula", 21, "F");
        p[1] = new Pessoa("Carla", 47, "F");
        p[2] = new Pessoa("Benício", 10, "M");
        
        l[0] = new Livro("Homo Deus", "Yuval Noah");
        l[1] = new Livro("Mister", "E L James");
        l[2] = new Livro("Essa Gente", "Chico Buarque");
        
        System.out.println(l[0].info());
        System.out.println(l[1].info());
        System.out.println(l[2].info());
        
    }
}
