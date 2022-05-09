package Atividade3_4_5_6;

public class principal {

    public static void main(String args[]) {
        Lampada l = new Lampada();
        
        l.setCor("Branca");
        l.setMarca("Philco");
        l.setLigada(true);
        l.setEstado(40);
        l.Display();
    }
}
