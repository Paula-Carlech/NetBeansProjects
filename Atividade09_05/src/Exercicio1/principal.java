package Exercicio1;
public class principal {
    public static void main(String args[]) {
        
        Alunos a1 = new Alunos("Fulano", 2000);
        Alunos a2 = new Alunos("Ciclano", 2003);
        Alunos a3 = new Alunos("Beltrano", 1999);
        Alunos a4 = new Alunos("José", 2002);
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        
        a1.TotCadastrado();
    }
}
