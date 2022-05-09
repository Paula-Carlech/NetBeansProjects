package Atividade2;

public class principal {

    public static void main(String args[]) {
        
        Empregado imput1 = new Empregado();
        Empregado imput2 = new Empregado();
        
        imput1.setPrimeiroNome("Paula");
        imput1.setSobrenome("Carlech");
        imput1.setSalario(5.800f);
        
        if(imput1.getSalario() < 0){
            imput1.setSalario(0.0f);
        }else{
            System.out.println("Válido!");
        }
        
        imput1.salarioAnual();
        imput1.salarioAnualComAumento();
        
        imput2.setPrimeiroNome("Carla");
        imput2.setSobrenome("Carlech");
        imput2.setSalario(2.900f);
        
        if(imput2.getSalario() < 0){
            imput2.setSalario(0.0f);
        }else{
            System.out.println("Válido!");
        }
        
        imput2.salarioAnual();
        imput2.salarioAnualComAumento();
    }
}
