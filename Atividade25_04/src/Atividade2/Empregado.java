package Atividade2;

public class Empregado {
    
    private String primeiroNome;
    private String sobrenome;
    private float salario;
    
    public String getPrimeiroNome(){
        return primeiroNome;
    }
    
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void salarioAnual(){
        float temp = 0;
        temp = this.salario * 12;
        
        System.out.println("Salário anual: " + temp);
    }
    
    public void salarioAnualComAumento(){
        float temp = 0;
        temp = (this.salario * 12) * 0.10f;
        
        System.out.println("Salário anual com 10% de aumento: " + temp);
    }
}
