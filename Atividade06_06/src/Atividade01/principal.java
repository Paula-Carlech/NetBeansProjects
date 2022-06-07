package Atividade01;
public class principal {
    public static void main(String[] args) {
        
        Empregado emp01 = new Empregado("Paula", 001);
        Engenheiro eng02 = new Engenheiro("Fulano", 002, "Engenharia");
        Secretaria sec03 = new Secretaria("Ana", 003, "Secretaria");
        
        eng02.gerenciaobra();
        sec03.imprimirdocumentos();
        
        System.out.println(emp01.toString()); 
    }
}
