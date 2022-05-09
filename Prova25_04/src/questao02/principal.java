package questao02;

public class principal {

    public static void main(String[] args) {
        
        Candidato[] c = new Candidato[4];
        
        c[0] = new Candidato("Pessoa 1", "F" ,70);
        c[1] = new Candidato("Pessoa 2", "M" ,60);
        c[2] = new Candidato("Pessoa 3", "F" ,90);
        c[3] = new Candidato("Pessoa 4", "M" ,50);
        
        c[0].Display();
        c[1].Display();
        c[2].Display();
        c[3].Display();
    }
}