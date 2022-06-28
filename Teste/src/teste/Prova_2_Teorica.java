package teste;
public class Prova_2_Teorica{
    public static void main( String [] args ){
        
        RoboSimples fulano = new RoboSimples("Fulano", 20, 10, ’S’);
        RoboSimples ciclana = new RoboSimples("Ciclana");
        RoboSimples beltrana = new RoboSimples();
        fulano.move();
        fulano.imprimePosicao();
    }
}
