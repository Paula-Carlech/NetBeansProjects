package Atividade10;

public class principal {

    public static void main(String args[]) {
        
        ArvoreGenealogica p1 = new ArvoreGenealogica("Paula", 21, "Anderson", "Carla");
        ArvoreGenealogica p2 = new ArvoreGenealogica("Anderson", 52, "Hiltron", "Heloísa");
        ArvoreGenealogica p3 = new ArvoreGenealogica("Carla", 48, "José", "Amélia");
        
        p1.Display();
        p2.Display();
        p3.Display();
    }
}
